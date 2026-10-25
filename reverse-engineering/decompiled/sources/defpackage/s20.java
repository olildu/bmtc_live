package defpackage;

import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19264a;
    public final /* synthetic */ FareDetailsComponent b;

    public /* synthetic */ s20(FareDetailsComponent fareDetailsComponent, int i) {
        this.f19264a = i;
        this.b = fareDetailsComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19264a) {
            case 0:
                this.b.Z0(FareDetailsIntent.FinalFareBottomSheetPayButtonClickedIntent.f3930a);
                break;
            case 1:
                this.b.Z0(FareDetailsIntent.FinalFareBottomSheetTermsAndConditionsTextClickedIntent.f3931a);
                break;
            case 2:
                this.b.Z0(FareDetailsIntent.FinalFareBottomSheetPayButtonClickedIntent.f3930a);
                break;
            case 3:
                this.b.Z0(FareDetailsIntent.FinalFareBottomSheetCancelButtonClickedIntent.f3929a);
                break;
            case 4:
                this.b.Z0(FareDetailsIntent.FinalFareBottomSheetTermsAndConditionsTextClickedIntent.f3931a);
                break;
            case 5:
                this.b.Z0(FareDetailsIntent.FareValidationFailedBottomSheetPayButtonClickedIntent.f3927a);
                break;
            case 6:
                this.b.Z0(FareDetailsIntent.FareValidationFailedDismissButtonClickedIntent.f3928a);
                break;
            default:
                String str = this.b.L;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
        }
        return Unit.f17538a;
    }
}
