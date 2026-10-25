package defpackage;

import app.chalo.permissions.models.PermissionState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewIntent;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dg1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15460a;
    public final /* synthetic */ SuperPassProofOverviewViewModel b;

    public /* synthetic */ dg1(SuperPassProofOverviewViewModel superPassProofOverviewViewModel, int i) {
        this.f15460a = i;
        this.b = superPassProofOverviewViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15460a) {
            case 0:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                this.b.t(new SuperPassProofOverviewIntent.NameEnteredIntent(it));
                return Unit.f17538a;
            default:
                int i = SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1.WhenMappings.f8489a[((PermissionState) obj).ordinal()];
                SuperPassProofOverviewViewModel superPassProofOverviewViewModel = this.b;
                if (i == 1) {
                    superPassProofOverviewViewModel.p(new mb1(25));
                } else if (i == 2) {
                    superPassProofOverviewViewModel.p(new mb1(26));
                } else if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f17538a;
        }
    }
}
