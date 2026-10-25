package app.chalo.productpurchase.passpurchase.data;

import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProfilePhotoProofPrefillHelperKt {
    public static final void a(List proofDocumentPropsList, HashMap map, String str, Set invalidRejectedProofIds) {
        Object next;
        Intrinsics.i(proofDocumentPropsList, "proofDocumentPropsList");
        Intrinsics.i(invalidRejectedProofIds, "invalidRejectedProofIds");
        if (str != null) {
            String str2 = !StringsKt.F(str) ? str : null;
            if (str2 == null) {
                return;
            }
            Iterator it = proofDocumentPropsList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((ProofDocumentProps) next).f9539a, "PHOTOGRAPH"));
            ProofDocumentProps proofDocumentProps = (ProofDocumentProps) next;
            if (proofDocumentProps == null) {
                return;
            }
            String str3 = proofDocumentProps.f9539a;
            if (invalidRejectedProofIds.contains(str3)) {
                return;
            }
            ProofUploadDetails proofUploadDetails = (ProofUploadDetails) map.get(str3);
            ProofUploadStatus proofUploadStatus = proofUploadDetails != null ? proofUploadDetails.d : null;
            ProofUploadStatus proofUploadStatus2 = ProofUploadStatus.UPLOAD_SUCCESSFUL;
            if (proofUploadStatus != proofUploadStatus2 || StringsKt.F(proofUploadDetails.f8316a)) {
                map.put(str3, new ProofUploadDetails(str2, (BitmapImage) null, "", proofUploadStatus2, false));
            }
        }
    }
}
