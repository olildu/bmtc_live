package app.chalo.reportproblem;

import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/InitiateFreshChatCustomerSupportUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InitiateFreshChatCustomerSupportUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreshchatUserInteractionContract f9013a;

    public InitiateFreshChatCustomerSupportUseCase(FreshchatUserInteractionContract freshchatUserInteractionContract) {
        this.f9013a = freshchatUserInteractionContract;
    }

    public final void a(String str, boolean z, ReportProblemFeatureProblem reportProblemFeatureProblem, Map map) {
        List list = reportProblemFeatureProblem.c;
        String str2 = reportProblemFeatureProblem.e;
        String str3 = reportProblemFeatureProblem.d;
        HashMap map2 = new HashMap();
        if (str3.length() > 0) {
            map2.put("chatGroupTag", str3);
        }
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), (String) entry.getValue());
        }
        FreshchatUserInteractionContract freshchatUserInteractionContract = this.f9013a;
        freshchatUserInteractionContract.d(map2);
        if (StringsKt.x(str2, "article", true)) {
            freshchatUserInteractionContract.c(list, z, str, "article");
        } else if (StringsKt.x(str2, "category", true)) {
            freshchatUserInteractionContract.c(list, z, str, "category");
        } else if (StringsKt.x(str2, "chat", true)) {
            freshchatUserInteractionContract.a();
        }
    }
}
