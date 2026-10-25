package defpackage;

import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImage;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImageSerializable;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewDataState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewIntent;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewRestoreState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eg1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15551a;
    public final /* synthetic */ SuperPassProofOverviewViewModel b;

    public /* synthetic */ eg1(SuperPassProofOverviewViewModel superPassProofOverviewViewModel, int i) {
        this.f15551a = i;
        this.b = superPassProofOverviewViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedHashMap linkedHashMap;
        int i = this.f15551a;
        SuperPassProofOverviewIntent.DismissCameraRationaleDialogIntent dismissCameraRationaleDialogIntent = SuperPassProofOverviewIntent.DismissCameraRationaleDialogIntent.f8470a;
        Unit unit = Unit.f17538a;
        SuperPassProofOverviewViewModel superPassProofOverviewViewModel = this.b;
        switch (i) {
            case 0:
                superPassProofOverviewViewModel.s.b();
                superPassProofOverviewViewModel.C("camera permission denied dialog displayed", MapsKt.k(new Pair("isDismissed", Boolean.FALSE)));
                superPassProofOverviewViewModel.t(dismissCameraRationaleDialogIntent);
                return unit;
            case 1:
                superPassProofOverviewViewModel.C("camera permission denied dialog displayed", MapsKt.k(new Pair("isDismissed", Boolean.TRUE)));
                superPassProofOverviewViewModel.t(dismissCameraRationaleDialogIntent);
                return unit;
            case 2:
                SuperPassProofOverviewDataState superPassProofOverviewDataState = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel.f.getValue();
                Intrinsics.i(superPassProofOverviewDataState, "<this>");
                boolean z = superPassProofOverviewDataState.f8466a;
                boolean z2 = superPassProofOverviewDataState.b;
                boolean z3 = superPassProofOverviewDataState.c;
                String str = superPassProofOverviewDataState.d;
                Map map = superPassProofOverviewDataState.i;
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(MapsKt.g(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ((ProofUploadDetails) entry.getValue()).a());
                    }
                } else {
                    linkedHashMap = null;
                }
                boolean z4 = superPassProofOverviewDataState.k;
                boolean z5 = superPassProofOverviewDataState.l;
                EnlargeProofImage enlargeProofImage = superPassProofOverviewDataState.o;
                return new SuperPassProofOverviewRestoreState(z, z2, z3, str, linkedHashMap, z4, z5, enlargeProofImage != null ? new EnlargeProofImageSerializable(enlargeProofImage.f8455a) : null, superPassProofOverviewDataState.m, superPassProofOverviewDataState.n);
            case 3:
                superPassProofOverviewViewModel.t(new SuperPassProofOverviewIntent.InitializationIntent(superPassProofOverviewViewModel.k));
                return unit;
            case 4:
                superPassProofOverviewViewModel.t(SuperPassProofOverviewIntent.NextButtonClickedIntent.f8477a);
                return unit;
            case 5:
                superPassProofOverviewViewModel.t(SuperPassProofOverviewIntent.ConsentCheckboxToggledIntent.f8469a);
                return unit;
            default:
                superPassProofOverviewViewModel.t(SuperPassProofOverviewIntent.DismissEnlargeImageIntent.f8471a);
                return unit;
        }
    }
}
