package app.chalo.analytics.senders;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/senders/AnalyticsSendersProvider;", "", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AnalyticsSendersProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseAnalyticsSender f880a;

    public AnalyticsSendersProvider(FirebaseAnalyticsSender firebaseAnalyticsSender) {
        this.f880a = firebaseAnalyticsSender;
    }

    public List a() {
        return CollectionsKt.R(this.f880a);
    }
}
