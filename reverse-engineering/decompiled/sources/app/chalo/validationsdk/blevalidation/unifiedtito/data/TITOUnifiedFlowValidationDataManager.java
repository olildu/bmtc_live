package app.chalo.validationsdk.blevalidation.unifiedtito.data;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/unifiedtito/data/TITOUnifiedFlowValidationDataManager;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TITOUnifiedFlowValidationDataManager {
    String a(BleValidationAckData.TITOTapInData tITOTapInData);

    Object b(String str, BleValidationAckData.TITOTapOutData tITOTapOutData, ContinuationImpl continuationImpl);

    Object c(String str, BleValidationAckData.TITOTapOutData tITOTapOutData, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Object e(BleValidationAckData.TITOTapInData tITOTapInData, ValidationProduct validationProduct, String str, ContinuationImpl continuationImpl);

    Object f(ValidationProduct validationProduct, ContinuationImpl continuationImpl);
}
