package app.chalo.validationsdk.blevalidation.domain.validationprocess;

import android.util.Base64;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.constants.ValidationPayloadConstants;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/validationprocess/GetRegularBusBLEValidationPayloadUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRegularBusBLEValidationPayloadUseCase {
    public static byte[] a(ValidationProduct validationProduct, long j, String staticPayload, ValidationPayloadMetaData validationPayloadMetaData) {
        byte b;
        Intrinsics.i(validationProduct, "validationProduct");
        Intrinsics.i(staticPayload, "staticPayload");
        byte[] bArrDecode = Base64.decode(staticPayload, 2);
        byte[] bArr = ValidationPayloadConstants.f10470a;
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
            b = 33;
        } else if (validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) {
            b = 81;
        } else if (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) {
            b = 65;
        } else if (validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) {
            ValidationPayloadMetaData.QuickPayMeta quickPayMeta = validationPayloadMetaData instanceof ValidationPayloadMetaData.QuickPayMeta ? (ValidationPayloadMetaData.QuickPayMeta) validationPayloadMetaData : null;
            b = 49;
            if (quickPayMeta != null && quickPayMeta.f10481a) {
                b = -96;
            }
        } else if ((validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) || (validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation)) {
            b = 17;
        } else if ((validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation)) {
            b = 97;
        } else {
            if (!(validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
                throw new NoWhenBranchMatchedException();
            }
            b = -1;
        }
        long j2 = j / ((long) 1000);
        byte[] bArrCopyOf = {(byte) j2};
        for (int i = 1; i < 4; i++) {
            int length = bArrCopyOf.length;
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + 1);
            bArrCopyOf[length] = (byte) (j2 >> (i * 8));
        }
        byte[] bArrB0 = ArraysKt.b0(ArraysKt.b0(bArr, new byte[]{b}), bArrCopyOf);
        Intrinsics.f(bArrDecode);
        return ArraysKt.b0(bArrB0, bArrDecode);
    }
}
