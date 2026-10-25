package app.chalo.analytics.sender;

import app.chalo.analytics.senders.AnalyticsSendersProvider;
import app.chalo.analytics.senders.FirebaseAnalyticsSender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/sender/AndroidAnalyticsSendersProvider;", "Lapp/chalo/analytics/senders/AnalyticsSendersProvider;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidAnalyticsSendersProvider extends AnalyticsSendersProvider {
    public final AndroidMixpanelAnalyticsSender b;

    public AndroidAnalyticsSendersProvider(FirebaseAnalyticsSender firebaseAnalyticsSender, AndroidMixpanelAnalyticsSender androidMixpanelAnalyticsSender) {
        super(firebaseAnalyticsSender);
        this.b = androidMixpanelAnalyticsSender;
    }

    @Override // app.chalo.analytics.senders.AnalyticsSendersProvider
    public final List a() {
        ArrayList arrayListE0 = CollectionsKt.E0(CollectionsKt.R(this.f880a));
        arrayListE0.add(this.b);
        return arrayListE0;
    }
}
