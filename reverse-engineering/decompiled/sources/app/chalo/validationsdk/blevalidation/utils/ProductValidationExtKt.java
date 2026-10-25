package app.chalo.validationsdk.blevalidation.utils;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProductKt;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductValidationExtKt {
    public static final Object a(ProductValidationConfigProvider productValidationConfigProvider, ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        return productValidationConfigProvider.a(validationProduct).l(new Product(validationProduct.getC(), (String) ValidationProductKt.a(validationProduct).d(), (String) ValidationProductKt.a(validationProduct).e()), continuationImpl);
    }
}
