package app.chalo.utils.abtestanalytics;

import app.chalo.analytics.contract.AnalyticsContract;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/abtestanalytics/ABTestAnalyticsEventHandler;", "Lapp/chalo/utils/abtestanalytics/ABTestAnalyticsContract;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ABTestAnalyticsEventHandler implements ABTestAnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f10447a;

    public ABTestAnalyticsEventHandler(AnalyticsContract analyticsContract) {
        this.f10447a = analyticsContract;
    }

    @Override // app.chalo.utils.abtestanalytics.ABTestAnalyticsContract
    public final void a(String experimentName, String experimentId, String variant, String source) {
        Intrinsics.i(experimentName, "experimentName");
        Intrinsics.i(experimentId, "experimentId");
        Intrinsics.i(variant, "variant");
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this.f10447a, "Exp: ".concat(experimentName), source, MapsKt.i(new Pair("variant", variant), new Pair(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, experimentId)), null, false, 24);
    }
}
