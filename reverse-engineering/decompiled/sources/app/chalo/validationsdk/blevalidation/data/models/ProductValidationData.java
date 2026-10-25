package app.chalo.validationsdk.blevalidation.data.models;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductValidationData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean a(ProductValidationData productValidationData) {
            ProductValidationModel productValidationModelF = productValidationData.f();
            return productValidationModelF != null && productValidationModelF.d();
        }
    }

    Long A();

    ChaloTransitMode B();

    Object C(ContinuationImpl continuationImpl);

    UserDetailsForProducts D();

    Object F(Continuation continuation);

    String a();

    String b();

    void clear();

    boolean d();

    ValidationPayloadMetaData e();

    ProductValidationModel f();

    String g();

    String getId();

    Object h(ContinuationImpl continuationImpl);

    void i(HashMap map);

    long j();

    Object k(ContinuationImpl continuationImpl);

    Long l();

    void m(ProductValidationModel productValidationModel);

    String n();

    Object o(ContinuationImpl continuationImpl);

    long p();

    Object q(ContinuationImpl continuationImpl);

    Object r(ContinuationImpl continuationImpl);

    String s();

    Object t(ContinuationImpl continuationImpl);

    LinkedHashMap u();

    Object v(ContinuationImpl continuationImpl);

    long w();

    Object x(ContinuationImpl continuationImpl);

    UserDetailsForProducts y();

    QRValidationType z();
}
