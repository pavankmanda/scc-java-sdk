package com.ibm.cloud.scc.findings_api.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.scc.findings_api.v1.model.DeleteNoteOptions;

public class DeleteNote {
    protected DeleteNote() {
    }

    public static String apiKey = System.getenv("API_KEY");
    public static String accountId = System.getenv("ACCOUNT_ID");
    public static String iamUrl = System.getenv("IAM_URL");
    public static String apiUrl = System.getenv("FINDINGS_API_URL");
    public static String testString = "testString";

    public static Authenticator authenticator = new IamAuthenticator(apiKey, iamUrl, null, null, true, null);
    public static FindingsApi service = new FindingsApi("findings_api", authenticator);

    public static void main(String[] args) {

        service.setServiceUrl(apiUrl);

        DeleteNoteOptions findingNoteDeleteOpts = new DeleteNoteOptions.Builder().accountId(accountId)
                .providerId(testString).noteId(testString).build();

        Response<Void> resp = service.deleteNote(findingNoteDeleteOpts).execute();
        System.out.println(resp.getResult());
    }
}
