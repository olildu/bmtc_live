package defpackage;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmPassPurchaseStateKeeperMeta;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseIntent;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ps implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19064a;
    public final /* synthetic */ ConfirmSuperPassPurchaseViewModel b;

    public /* synthetic */ ps(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, int i) {
        this.f19064a = i;
        this.b = confirmSuperPassPurchaseViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19064a) {
            case 0:
                this.b.K(ConfirmSuperPassPurchaseIntent.DismissBottomSheetIntent.f8366a);
                break;
            case 1:
                this.b.K(ConfirmSuperPassPurchaseIntent.PassAlreadyAvailedBottomSheetPositiveClickedIntent.f8375a);
                break;
            case 2:
                this.b.K(ConfirmSuperPassPurchaseIntent.FareMappingFailedBottomSheetConfirmClickedIntent.f8373a);
                break;
            case 3:
                this.b.K(ConfirmSuperPassPurchaseIntent.FareMappingFailedBottomSheetCancelClickedIntent.f8372a);
                break;
            case 4:
                this.b.K(ConfirmSuperPassPurchaseIntent.ShowTermsAndConditions.f8378a);
                break;
            case 5:
                this.b.K(ConfirmSuperPassPurchaseIntent.SubmitBtnClickedIntent.f8379a);
                break;
            case 6:
                this.b.K(ConfirmSuperPassPurchaseIntent.InitializationIntent.f8374a);
                break;
            case 7:
                this.b.K(ConfirmSuperPassPurchaseIntent.FareDetailsLayoutClickedIntent.f8371a);
                break;
            case 8:
                this.b.K(ConfirmSuperPassPurchaseIntent.ShowTermsAndConditions.f8378a);
                break;
            case 9:
                this.b.K(ConfirmSuperPassPurchaseIntent.EditPassStartDateIntent.f8369a);
                break;
            case 10:
                this.b.K(ConfirmSuperPassPurchaseIntent.EditUserNameForNoProofRequirementIntent.f8370a);
                break;
            case 11:
                this.b.K(ConfirmSuperPassPurchaseIntent.DismissZoomImageIntent.f8368a);
                break;
            case 12:
                this.b.K(ConfirmSuperPassPurchaseIntent.DismissDialogIntent.f8367a);
                break;
            case 13:
                this.b.K(ConfirmSuperPassPurchaseIntent.DismissDialogIntent.f8367a);
                break;
            default:
                CreateOrderResponseAppModel createOrderResponseAppModel = this.b.K;
                if (createOrderResponseAppModel != null) {
                    return new ConfirmPassPurchaseStateKeeperMeta(createOrderResponseAppModel);
                }
                return null;
        }
        return Unit.f17538a;
    }
}
