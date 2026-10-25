package app.chalo.validationsdk.blevalidation.helper;

import androidx.exifinterface.media.ExifInterface;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/ValidationQrGenerator;", "Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme;", ExifInterface.LATITUDE_SOUTH, "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ValidationQrGenerator<S extends DynamicQrScheme> {
    Object a(ProductValidationData productValidationData, Function1 function1, ValidationProduct validationProduct, Continuation continuation);
}
