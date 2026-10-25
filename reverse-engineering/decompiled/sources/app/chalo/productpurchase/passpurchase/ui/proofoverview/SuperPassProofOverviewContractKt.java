package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetailsSerializable;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedContractKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import defpackage.ag1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassProofOverviewContractKt {
    public static final SuperPassProofUploadedImageUIState a(SuperPassProofUploadedImageStageUIState superPassProofUploadedImageStageUIState, IconType iconType, Function0 function0) {
        return new SuperPassProofUploadedImageUIState(superPassProofUploadedImageStageUIState, iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().j), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null, UiEventHandler.Companion.a(new ag1(function0, 0)));
    }

    public static final SuperPassProofOverviewDataState b(SuperPassProofOverviewRestoreState superPassProofOverviewRestoreState) {
        LinkedHashMap linkedHashMap;
        Intrinsics.i(superPassProofOverviewRestoreState, "<this>");
        boolean z = superPassProofOverviewRestoreState.f8479a;
        boolean z2 = superPassProofOverviewRestoreState.b;
        boolean z3 = superPassProofOverviewRestoreState.c;
        String str = superPassProofOverviewRestoreState.d;
        Map map = superPassProofOverviewRestoreState.e;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(MapsKt.g(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ProofUploadDetailsSerializable proofUploadDetailsSerializable = (ProofUploadDetailsSerializable) entry.getValue();
                SuperPassPurchaseSharedState superPassPurchaseSharedState = SuperPassPurchaseSharedContractKt.f8345a;
                Intrinsics.i(proofUploadDetailsSerializable, "<this>");
                linkedHashMap.put(key, new ProofUploadDetails(proofUploadDetailsSerializable.f8318a, (BitmapImage) null, proofUploadDetailsSerializable.b, proofUploadDetailsSerializable.c, proofUploadDetailsSerializable.d));
            }
        } else {
            linkedHashMap = null;
        }
        boolean z4 = superPassProofOverviewRestoreState.f;
        boolean z5 = superPassProofOverviewRestoreState.g;
        EnlargeProofImageSerializable enlargeProofImageSerializable = superPassProofOverviewRestoreState.h;
        return new SuperPassProofOverviewDataState(z, z2, z3, str, linkedHashMap, z4, z5, superPassProofOverviewRestoreState.i, superPassProofOverviewRestoreState.j, enlargeProofImageSerializable != null ? new EnlargeProofImage(enlargeProofImageSerializable.f8458a, null) : null, 752);
    }
}
