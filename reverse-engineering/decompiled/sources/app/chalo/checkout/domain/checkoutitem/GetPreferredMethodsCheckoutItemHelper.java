package app.chalo.checkout.domain.checkoutitem;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringProvider;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/checkoutitem/GetPreferredMethodsCheckoutItemHelper;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPreferredMethodsCheckoutItemHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GetPreferredMethodsCheckoutItemHelper f1391a = new GetPreferredMethodsCheckoutItemHelper();

    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0241  */
    /* JADX WARN: Code duplicated, block: B:56:0x024d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v4, types: [app.chalo.checkout.analytics.ICheckoutAnalyticsHelper] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8, types: [app.chalo.checkout.analytics.ICheckoutAnalyticsHelper] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01ef -> B:52:0x01f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.ArrayList r21, app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver r22, app.chalo.providers.stringprovider.StringProvider r23, app.chalo.features.wallet.CurrencyFeature r24, app.chalo.checkout.domain.checkoutitem.ChaloPayCheckoutItemHelper.ChaloPayItemMetaData r25, app.chalo.checkout.analytics.ICheckoutAnalyticsHelper r26, java.util.List r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.checkoutitem.GetPreferredMethodsCheckoutItemHelper.a(java.util.ArrayList, app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver, app.chalo.providers.stringprovider.StringProvider, app.chalo.features.wallet.CurrencyFeature, app.chalo.checkout.domain.checkoutitem.ChaloPayCheckoutItemHelper$ChaloPayItemMetaData, app.chalo.checkout.analytics.ICheckoutAnalyticsHelper, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x030f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0374  */
    /* JADX WARN: Code duplicated, block: B:139:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:141:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:150:0x0419  */
    /* JADX WARN: Code duplicated, block: B:153:0x042c  */
    /* JADX WARN: Code duplicated, block: B:155:0x043d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0445  */
    /* JADX WARN: Code duplicated, block: B:185:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:217:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:26:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x017d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0246  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x02ea -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x034e -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x03b3 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0417 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x042c -> B:154:0x0438). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0443 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x044b -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0453 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x045b -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0463 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x046b -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0473 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x047b -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0483 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0487 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x048f -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0497 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x049f -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0151 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01bc -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0220 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0285 -> B:184:0x04a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.LinkedHashSet r18, app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver r19, app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.checkoutitem.GetPreferredMethodsCheckoutItemHelper.b(java.util.LinkedHashSet, app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver, app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(CheckoutPaymentDataResolver checkoutPaymentDataResolver, CommonCheckoutItemUseCase commonCheckoutItemUseCase, StringProvider stringProvider, CurrencyFeature currencyFeature, ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, List list, ContinuationImpl continuationImpl) {
        GetPreferredMethodsCheckoutItemHelper$getPreferredMethods$1 getPreferredMethodsCheckoutItemHelper$getPreferredMethods$1;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver2;
        Set set;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper2;
        List list2;
        CurrencyFeature currencyFeature2;
        ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData2;
        StringProvider stringProvider2;
        List list3;
        if (continuationImpl instanceof GetPreferredMethodsCheckoutItemHelper$getPreferredMethods$1) {
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$1 = (GetPreferredMethodsCheckoutItemHelper$getPreferredMethods$1) continuationImpl;
            int i = getPreferredMethodsCheckoutItemHelper$getPreferredMethods$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPreferredMethodsCheckoutItemHelper$getPreferredMethods$1.label = i - Integer.MIN_VALUE;
            } else {
                getPreferredMethodsCheckoutItemHelper$getPreferredMethods$1 = new GetPreferredMethodsCheckoutItemHelper$getPreferredMethods$1(this, continuationImpl);
            }
        } else {
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$1 = new GetPreferredMethodsCheckoutItemHelper$getPreferredMethods$1(this, continuationImpl);
        }
        GetPreferredMethodsCheckoutItemHelper$getPreferredMethods$1 getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2 = getPreferredMethodsCheckoutItemHelper$getPreferredMethods$1;
        Object obj = getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$0 = checkoutPaymentDataResolver;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$1 = stringProvider;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$2 = currencyFeature;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$3 = chaloPayItemMetaData;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$4 = iCheckoutAnalyticsHelper;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$5 = list;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$6 = linkedHashSet;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.label = 1;
            if (b(linkedHashSet, checkoutPaymentDataResolver, commonCheckoutItemUseCase, getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2) != obj2) {
                checkoutPaymentDataResolver2 = checkoutPaymentDataResolver;
                set = linkedHashSet;
                iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper;
                list2 = list;
                currencyFeature2 = currencyFeature;
                chaloPayItemMetaData2 = chaloPayItemMetaData;
                stringProvider2 = stringProvider;
            }
            return obj2;
        }
        if (i2 == 1) {
            set = (Set) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$6;
            List list4 = (List) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$5;
            ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper3 = (ICheckoutAnalyticsHelper) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$4;
            ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData3 = (ChaloPayCheckoutItemHelper.ChaloPayItemMetaData) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$3;
            CurrencyFeature currencyFeature3 = (CurrencyFeature) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$2;
            stringProvider2 = (StringProvider) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$1;
            CheckoutPaymentDataResolver checkoutPaymentDataResolver3 = (CheckoutPaymentDataResolver) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$0;
            ResultKt.b(obj);
            currencyFeature2 = currencyFeature3;
            checkoutPaymentDataResolver2 = checkoutPaymentDataResolver3;
            list2 = list4;
            iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper3;
            chaloPayItemMetaData2 = chaloPayItemMetaData3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list5 = (List) getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$0;
            ResultKt.b(obj);
            list3 = list5;
        }
        return CollectionsKt.D0(list3);
        ArrayList arrayListE0 = CollectionsKt.E0(set);
        if (!arrayListE0.isEmpty()) {
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$0 = arrayListE0;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$1 = null;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$2 = null;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$3 = null;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$4 = null;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$5 = null;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.L$6 = null;
            getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2.label = 2;
            if (a(arrayListE0, checkoutPaymentDataResolver2, stringProvider2, currencyFeature2, chaloPayItemMetaData2, iCheckoutAnalyticsHelper2, list2, getPreferredMethodsCheckoutItemHelper$getPreferredMethods$2) != obj2) {
                list3 = arrayListE0;
            }
            return obj2;
        }
        list3 = arrayListE0;
        return CollectionsKt.D0(list3);
    }
}
