package defpackage;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15760a;
    public final /* synthetic */ PbPassPurchaseLandingScreenComponent b;
    public final /* synthetic */ PBOriginDestinationAppModel c;

    public /* synthetic */ gr0(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, PBOriginDestinationAppModel pBOriginDestinationAppModel, int i) {
        this.f15760a = i;
        this.b = pbPassPurchaseLandingScreenComponent;
        this.c = pBOriginDestinationAppModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15760a) {
            case 0:
                this.b.O0(new PbPassPurchaseLandingScreenIntent.OriginDestinationPointSelectedIntent(this.c));
                break;
            case 1:
                this.b.O0(new PbPassPurchaseLandingScreenIntent.OriginDestinationStopDetailsClickedIntent(this.c));
                break;
            default:
                this.b.O0(new PbPassPurchaseLandingScreenIntent.OriginDestinationPointSelectedIntent(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
