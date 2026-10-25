package defpackage;

import app.chalo.constants.Source;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19886a;
    public final /* synthetic */ FareDetailsComponent b;
    public final /* synthetic */ String c;

    public /* synthetic */ w20(FareDetailsComponent fareDetailsComponent, String str, int i) {
        this.f19886a = i;
        this.b = fareDetailsComponent;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19886a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                FareDetailsComponent fareDetailsComponent = this.b;
                fareDetailsComponent.T = true;
                fareDetailsComponent.y.b(new ChaloNavigationRequest.Navigate(new MinProfileUpdateArgs(this.c, zBooleanValue, Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT), null, null, 6));
                return Unit.f17538a;
            case 1:
                FareDetailsComponent fareDetailsComponent2 = this.b;
                boolean zN0 = FareDetailsComponent.N0(fareDetailsComponent2);
                List listD0 = CollectionsKt.D0(fareDetailsComponent2.O.values());
                boolean zP0 = FareDetailsComponent.P0(fareDetailsComponent2);
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, listD0, this.c, zN0, false, null, FareDetailsComponent.b1(fareDetailsComponent2), null, null, false, null, null, null, null, zP0, false, null, null, null, false, null, false, null, null, null, null, null, null, -8393601, 31);
            case 2:
                FareDetailsComponent fareDetailsComponent3 = this.b;
                boolean zN1 = FareDetailsComponent.N0(fareDetailsComponent3);
                List listD1 = CollectionsKt.D0(fareDetailsComponent3.O.values());
                boolean zP1 = FareDetailsComponent.P0(fareDetailsComponent3);
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, listD1, this.c, zN1, false, null, FareDetailsComponent.b1(fareDetailsComponent3), null, null, false, null, null, null, null, zP1, false, null, null, null, false, null, false, null, null, null, null, null, null, -8393601, 31);
            default:
                FareDetailsComponent fareDetailsComponent4 = this.b;
                List listD2 = CollectionsKt.D0(fareDetailsComponent4.O.values());
                boolean zP2 = FareDetailsComponent.P0(fareDetailsComponent4);
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, listD2, this.c, FareDetailsComponent.N0(fareDetailsComponent4), false, null, FareDetailsComponent.b1(fareDetailsComponent4), null, null, false, null, null, null, null, zP2, false, null, null, null, false, null, false, null, null, null, null, null, null, -8393601, 31);
        }
    }
}
