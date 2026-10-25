package defpackage;

import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsIntent;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsRestoredState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.userprofile.Gender;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xf1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20016a;
    public final /* synthetic */ SuperPassEnterUserDetailsViewModel b;

    public /* synthetic */ xf1(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, int i) {
        this.f20016a = i;
        this.b = superPassEnterUserDetailsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20016a) {
            case 0:
                this.b.D(SuperPassEnterUserDetailsIntent.NextBtnClickIntent.f8419a);
                break;
            case 1:
                this.b.D(SuperPassEnterUserDetailsIntent.DismissDialogIntent.f8414a);
                break;
            case 2:
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState = (SuperPassEnterUserDetailsDataState) this.b.f.getValue();
                Intrinsics.i(superPassEnterUserDetailsDataState, "<this>");
                String str = superPassEnterUserDetailsDataState.f8412a;
                Gender gender = superPassEnterUserDetailsDataState.b;
                Long l = superPassEnterUserDetailsDataState.c;
                Long l2 = superPassEnterUserDetailsDataState.d;
                boolean z = superPassEnterUserDetailsDataState.e;
                SuperPassBasicUserPurpose superPassBasicUserPurpose = superPassEnterUserDetailsDataState.f;
                if (superPassBasicUserPurpose == null) {
                    superPassBasicUserPurpose = SuperPassBasicUserPurpose.COMPLETE_DETAILS;
                }
                return new SuperPassEnterUserDetailsRestoredState(str, gender, l, l2, z, superPassBasicUserPurpose);
            case 3:
                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel = this.b;
                superPassEnterUserDetailsViewModel.D(new SuperPassEnterUserDetailsIntent.InitializationIntent(superPassEnterUserDetailsViewModel.k));
                break;
            case 4:
                this.b.D(SuperPassEnterUserDetailsIntent.GenderSelectionDialogClickedIntent.f8417a);
                break;
            case 5:
                this.b.D(SuperPassEnterUserDetailsIntent.DobFieldClickedIntent.f8415a);
                break;
            case 6:
                this.b.D(SuperPassEnterUserDetailsIntent.PassStartTimeFieldClickedIntent.f8420a);
                break;
            case 7:
                this.b.D(SuperPassEnterUserDetailsIntent.DismissDialogIntent.f8414a);
                break;
            default:
                this.b.D(SuperPassEnterUserDetailsIntent.DismissDialogIntent.f8414a);
                break;
        }
        return Unit.f17538a;
    }
}
