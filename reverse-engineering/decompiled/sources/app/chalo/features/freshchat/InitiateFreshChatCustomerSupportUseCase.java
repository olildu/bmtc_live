package app.chalo.features.freshchat;

import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/freshchat/InitiateFreshChatCustomerSupportUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InitiateFreshChatCustomerSupportUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreshchatUserInteractionContract f2722a;

    public InitiateFreshChatCustomerSupportUseCase(FreshchatUserInteractionContract freshchatUserInteractionContract) {
        this.f2722a = freshchatUserInteractionContract;
    }

    public final void a(ReportProblemFeatureProblem reportProblemFeatureProblem, LinkedHashMap linkedHashMap) {
        List list = reportProblemFeatureProblem.c;
        String str = reportProblemFeatureProblem.e;
        String str2 = reportProblemFeatureProblem.d;
        HashMap map = new HashMap();
        if (str2.length() > 0) {
            map.put("chatGroupTag", str2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        FreshchatUserInteractionContract freshchatUserInteractionContract = this.f2722a;
        freshchatUserInteractionContract.d(map);
        if (StringsKt.x(str, "article", true)) {
            freshchatUserInteractionContract.c(list, true, "Help and Support", "article");
        } else if (StringsKt.x(str, "category", true)) {
            freshchatUserInteractionContract.c(list, true, "Help and Support", "category");
        } else if (StringsKt.x(str, "chat", true)) {
            freshchatUserInteractionContract.a();
        }
    }
}
