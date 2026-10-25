package app.chalo.productpurchase.productselection.data.local;

import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropInfoApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/local/ProductPurchaseLocalDataSourceImpl;", "Lapp/chalo/productpurchase/productselection/data/local/ProductPurchaseLocalDataSource;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductPurchaseLocalDataSourceImpl implements ProductPurchaseLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f8556a;
    public final LocalDataStore b;
    public final LocalDataStore c;

    public ProductPurchaseLocalDataSourceImpl(LocalDataStore localDataStore, LocalDataStore localDataStore2, LocalDataStore localDataStore3) {
        this.f8556a = localDataStore;
        this.b = localDataStore2;
        this.c = localDataStore3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource
    public final Object d(String city, String agency, String documentId, ContinuationImpl continuationImpl) {
        ProductPurchaseLocalDataSourceImpl$getProofDocuments$1 productPurchaseLocalDataSourceImpl$getProofDocuments$1;
        if (continuationImpl instanceof ProductPurchaseLocalDataSourceImpl$getProofDocuments$1) {
            productPurchaseLocalDataSourceImpl$getProofDocuments$1 = (ProductPurchaseLocalDataSourceImpl$getProofDocuments$1) continuationImpl;
            int i = productPurchaseLocalDataSourceImpl$getProofDocuments$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseLocalDataSourceImpl$getProofDocuments$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseLocalDataSourceImpl$getProofDocuments$1 = new ProductPurchaseLocalDataSourceImpl$getProofDocuments$1(this, continuationImpl);
            }
        } else {
            productPurchaseLocalDataSourceImpl$getProofDocuments$1 = new ProductPurchaseLocalDataSourceImpl$getProofDocuments$1(this, continuationImpl);
        }
        Object objF = productPurchaseLocalDataSourceImpl$getProofDocuments$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseLocalDataSourceImpl$getProofDocuments$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            ProductConfigDocumentPropsApiResponseModel.INSTANCE.getClass();
            String strA = ProductConfigDocumentPropsApiResponseModel.Companion.a(city, agency, documentId);
            productPurchaseLocalDataSourceImpl$getProofDocuments$1.L$0 = city;
            productPurchaseLocalDataSourceImpl$getProofDocuments$1.L$1 = agency;
            productPurchaseLocalDataSourceImpl$getProofDocuments$1.L$2 = documentId;
            productPurchaseLocalDataSourceImpl$getProofDocuments$1.label = 1;
            objF = this.c.f(strA, productPurchaseLocalDataSourceImpl$getProofDocuments$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            documentId = (String) productPurchaseLocalDataSourceImpl$getProofDocuments$1.L$2;
            agency = (String) productPurchaseLocalDataSourceImpl$getProofDocuments$1.L$1;
            city = (String) productPurchaseLocalDataSourceImpl$getProofDocuments$1.L$0;
            ResultKt.b(objF);
        }
        String str = (String) objF;
        if (str == null) {
            return null;
        }
        ProductConfigDocumentPropsApiResponseModel.INSTANCE.getClass();
        Intrinsics.i(city, "city");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(documentId, "documentId");
        List listU = StringsKt.U(str, new String[]{"~~~"}, 6);
        String str2 = (String) CollectionsKt.L(1, listU);
        String str3 = (String) CollectionsKt.L(2, listU);
        return new ProductConfigDocumentPropsApiResponseModel(city, agency, documentId, new ProductConfigDocumentPropInfoApiResponseModel(str2, (String) CollectionsKt.L(5, listU), (String) CollectionsKt.L(3, listU), str3, (String) CollectionsKt.L(6, listU), (String) CollectionsKt.L(4, listU), null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource
    public final Serializable e(ContinuationImpl continuationImpl) {
        ProductPurchaseLocalDataSourceImpl$getAllProductConfig$1 productPurchaseLocalDataSourceImpl$getAllProductConfig$1;
        Collection collectionValues;
        Object objB;
        if (continuationImpl instanceof ProductPurchaseLocalDataSourceImpl$getAllProductConfig$1) {
            productPurchaseLocalDataSourceImpl$getAllProductConfig$1 = (ProductPurchaseLocalDataSourceImpl$getAllProductConfig$1) continuationImpl;
            int i = productPurchaseLocalDataSourceImpl$getAllProductConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseLocalDataSourceImpl$getAllProductConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseLocalDataSourceImpl$getAllProductConfig$1 = new ProductPurchaseLocalDataSourceImpl$getAllProductConfig$1(this, continuationImpl);
            }
        } else {
            productPurchaseLocalDataSourceImpl$getAllProductConfig$1 = new ProductPurchaseLocalDataSourceImpl$getAllProductConfig$1(this, continuationImpl);
        }
        Object objD = productPurchaseLocalDataSourceImpl$getAllProductConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseLocalDataSourceImpl$getAllProductConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            productPurchaseLocalDataSourceImpl$getAllProductConfig$1.label = 1;
            objD = this.f8556a.d(productPurchaseLocalDataSourceImpl$getAllProductConfig$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        Map map = (Map) objD;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            ChaloJson chaloJson = ChaloJson.f6455a;
            String string = obj.toString();
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(string, BuiltinSerializersKt.c(ProductConfigApiResponseModel.INSTANCE.serializer()));
            } catch (Exception unused) {
                objB = null;
            }
            ProductConfigApiResponseModel productConfigApiResponseModel = (ProductConfigApiResponseModel) objB;
            if (productConfigApiResponseModel != null) {
                arrayList.add(productConfigApiResponseModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource
    public final Object f(String str, ContinuationImpl continuationImpl) {
        ProductPurchaseLocalDataSourceImpl$getProductConfig$1 productPurchaseLocalDataSourceImpl$getProductConfig$1;
        if (continuationImpl instanceof ProductPurchaseLocalDataSourceImpl$getProductConfig$1) {
            productPurchaseLocalDataSourceImpl$getProductConfig$1 = (ProductPurchaseLocalDataSourceImpl$getProductConfig$1) continuationImpl;
            int i = productPurchaseLocalDataSourceImpl$getProductConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseLocalDataSourceImpl$getProductConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseLocalDataSourceImpl$getProductConfig$1 = new ProductPurchaseLocalDataSourceImpl$getProductConfig$1(this, continuationImpl);
            }
        } else {
            productPurchaseLocalDataSourceImpl$getProductConfig$1 = new ProductPurchaseLocalDataSourceImpl$getProductConfig$1(this, continuationImpl);
        }
        Object objF = productPurchaseLocalDataSourceImpl$getProductConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseLocalDataSourceImpl$getProductConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            productPurchaseLocalDataSourceImpl$getProductConfig$1.label = 1;
            objF = this.f8556a.f(str, productPurchaseLocalDataSourceImpl$getProductConfig$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        String str2 = (String) objF;
        Object objB = null;
        if (str2 == null) {
            return null;
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str2, BuiltinSerializersKt.c(ProductConfigApiResponseModel.INSTANCE.serializer()));
        } catch (Exception unused) {
        }
        return (ProductConfigApiResponseModel) objB;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:73:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x0152  */
    /* JADX WARN: Code duplicated, block: B:97:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0169, code lost:
    
        if (r10.f8556a.i(r12, r0) == r1) goto L92;
     */
    @Override // app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(app.chalo.productpurchase.productselection.data.models.api.AllProductConfigsApiResponseModel r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSourceImpl.g(app.chalo.productpurchase.productselection.data.models.api.AllProductConfigsApiResponseModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
