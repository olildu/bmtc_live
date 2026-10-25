package defpackage;

import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadDataState;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadIntent;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadRestoredState;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lg1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18311a;
    public final /* synthetic */ SuperPassUserProofUploadViewModel b;

    public /* synthetic */ lg1(SuperPassUserProofUploadViewModel superPassUserProofUploadViewModel, int i) {
        this.f18311a = i;
        this.b = superPassUserProofUploadViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f18311a;
        SuperPassUserProofUploadIntent.DismissCameraRationaleDialogIntent dismissCameraRationaleDialogIntent = SuperPassUserProofUploadIntent.DismissCameraRationaleDialogIntent.f8502a;
        Unit unit = Unit.f17538a;
        SuperPassUserProofUploadViewModel superPassUserProofUploadViewModel = this.b;
        switch (i) {
            case 0:
                superPassUserProofUploadViewModel.r(SuperPassUserProofUploadIntent.WatchTutorialClickedIntent.f8506a);
                return unit;
            case 1:
                superPassUserProofUploadViewModel.r(SuperPassUserProofUploadIntent.NextBtnClickedIntent.f8505a);
                return unit;
            case 2:
                superPassUserProofUploadViewModel.r(SuperPassUserProofUploadIntent.ZoomPlaceholderImageIntent.f8507a);
                return unit;
            case 3:
                superPassUserProofUploadViewModel.s.b();
                superPassUserProofUploadViewModel.s("camera permission denied dialog displayed", MapsKt.k(new Pair("isDismissed", Boolean.FALSE)));
                superPassUserProofUploadViewModel.r(dismissCameraRationaleDialogIntent);
                return unit;
            case 4:
                superPassUserProofUploadViewModel.s("camera permission denied dialog displayed", MapsKt.k(new Pair("isDismissed", Boolean.TRUE)));
                superPassUserProofUploadViewModel.r(dismissCameraRationaleDialogIntent);
                return unit;
            case 5:
                superPassUserProofUploadViewModel.r(SuperPassUserProofUploadIntent.DismissZoomedImageIntent.f8503a);
                return unit;
            case 6:
                SuperPassUserProofUploadDataState superPassUserProofUploadDataState = (SuperPassUserProofUploadDataState) superPassUserProofUploadViewModel.f.getValue();
                Intrinsics.i(superPassUserProofUploadDataState, "<this>");
                return new SuperPassUserProofUploadRestoredState(superPassUserProofUploadDataState.f8501a, superPassUserProofUploadDataState.b, superPassUserProofUploadDataState.c);
            default:
                superPassUserProofUploadViewModel.r(new SuperPassUserProofUploadIntent.InitializationIntent(superPassUserProofUploadViewModel.k));
                return unit;
        }
    }
}
