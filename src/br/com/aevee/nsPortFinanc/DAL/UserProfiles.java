package br.com.aevee.nsPortFinanc.DAL;

import java.util.ArrayList;
import java.util.List;

import br.com.aevee.port_finan.search_help.DTParam;
import br.com.aevee.port_finan.search_help.DTSHLPReq;
import br.com.aevee.port_finan.search_help.DTSHLPResp;
import br.com.aevee.port_finan.search_help.DTSearchhelp;
import br.com.aevee.port_finan.search_help.DTSearchhelpFull;
import br.com.aevee.port_finan.search_help.SISHLPReq;
import br.com.aevee.port_finan.search_help.SISHLPReqService;
import br.com.aevee.port_finan.usuario.DTUserProfiles;
import br.com.aevee.port_finan.usuario.DTUserProfilesExt;

public class UserProfiles extends Base{
	public UserProfiles(){
		super(SISHLPReqService.class);
	}

	public List<DTUserProfilesExt> GetAll(){
		SISHLPReq siLoginInterface = (SISHLPReq)super.getInterface();
		DTSHLPReq request = new DTSHLPReq();
		
		DTParam param = new DTParam();
		param.setPARAM("PROFILES");
		
		request.getPARAM().add(param);
		
		DTSHLPResp response = null;
		
		try{
			response = siLoginInterface.siSHLPReq(request);
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		
		List<DTUserProfilesExt> profiles = new ArrayList<DTUserProfilesExt>();
		if(response.getSearchHelp().size() > 0){
			for (DTSearchhelp item : response.getSearchHelp().get(0).getVALORES()) {
				DTUserProfilesExt profile = new DTUserProfilesExt();
				profile.setPROFILE(item.getVALOR());
				profile.setDescricao(item.getDESCR());
				profiles.add(profile);
			}
		}
		
		return profiles;
	}
}
