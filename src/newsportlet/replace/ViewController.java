package newsportlet.replace;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import newsportlet.commons.SharedBean;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

public class ViewController extends ParameterizableViewController {
	private SharedBean sharedBean;

	@Override
	protected ModelAndView handleRenderRequestInternal(RenderRequest request,
			RenderResponse response) throws Exception {
		Map<String, String> model = new HashMap<>();
		model.put("number", String.valueOf((sharedBean.getNumber())));
		model.put("from", sharedBean.getFrom());
		model.put("message", sharedBean.getMessage());
		model.put("objectId", sharedBean.getObjectId());

		return new ModelAndView(this.getViewName(), model);
	}

	public SharedBean getSharedBean() {
		return sharedBean;
	}

	public void setSharedBean(SharedBean sharedBean) {
		this.sharedBean = sharedBean;
	}
}
