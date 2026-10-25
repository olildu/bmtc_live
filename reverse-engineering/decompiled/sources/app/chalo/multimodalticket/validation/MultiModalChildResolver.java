package app.chalo.multimodalticket.validation;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalChildResolver;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MultiModalChildResolver {
    MultiModalChildValidationTarget a(ValidationPayloadIdentity validationPayloadIdentity);

    MultiModalChildValidationTarget b(ProductValidationData productValidationData);
}
