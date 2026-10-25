package app.chalo.multimodalticket.validation;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import defpackage.xs;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/MultiProductValidationData;", "EmptyUserDetailsForProducts", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationData implements MultiProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f5977a;
    public final TimeUtilsContract b;
    public final StringProvider c;
    public final CurrencyFeature d;
    public volatile MultiModalGroupTicketValidationModel e;
    public volatile ProductValidationData f;
    public volatile LinkedHashMap g = new LinkedHashMap();
    public volatile Map h = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationData$EmptyUserDetailsForProducts;", "Lapp/chalo/receipt/UserDetailsForProducts;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EmptyUserDetailsForProducts implements UserDetailsForProducts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EmptyUserDetailsForProducts f5978a = new EmptyUserDetailsForProducts();

        @Override // app.chalo.receipt.UserDetailsForProducts
        /* JADX INFO: renamed from: a */
        public final String getC() {
            return "";
        }

        @Override // app.chalo.receipt.UserDetailsForProducts
        public final String b() {
            return "";
        }

        @Override // app.chalo.receipt.UserDetailsForProducts
        /* JADX INFO: renamed from: c */
        public final String getE() {
            return "";
        }

        @Override // app.chalo.receipt.UserDetailsForProducts
        public final /* bridge */ /* synthetic */ StringEnum d() {
            return null;
        }

        @Override // app.chalo.receipt.UserDetailsForProducts
        public final String e() {
            return "";
        }
    }

    public MultiModalGroupTicketValidationData(BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, StringProvider stringProvider, CurrencyFeature currencyFeature) {
        this.f5977a = basicInfoContract;
        this.b = timeUtilsContract;
        this.c = stringProvider;
        this.d = currencyFeature;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ChaloTransitMode B() {
        return ChaloTransitMode.ALL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object C(ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationData$isValid$1 multiModalGroupTicketValidationData$isValid$1;
        ProductValidationModel productValidationModel;
        if (continuationImpl instanceof MultiModalGroupTicketValidationData$isValid$1) {
            multiModalGroupTicketValidationData$isValid$1 = (MultiModalGroupTicketValidationData$isValid$1) continuationImpl;
            int i = multiModalGroupTicketValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationData$isValid$1 = new MultiModalGroupTicketValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationData$isValid$1 = new MultiModalGroupTicketValidationData$isValid$1(this, continuationImpl);
        }
        Object obj = multiModalGroupTicketValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationData$isValid$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
            if (multiModalGroupTicketValidationModel == null) {
                return Boolean.FALSE;
            }
            BasicInfoContract basicInfoContract = this.f5977a;
            multiModalGroupTicketValidationData$isValid$1.L$0 = multiModalGroupTicketValidationModel;
            multiModalGroupTicketValidationData$isValid$1.label = 1;
            Object objC = basicInfoContract.c(multiModalGroupTicketValidationData$isValid$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            productValidationModel = multiModalGroupTicketValidationModel;
            obj = objC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productValidationModel = (ProductValidationModel) multiModalGroupTicketValidationData$isValid$1.L$0;
            ResultKt.b(obj);
        }
        return Boolean.valueOf(((Number) obj).longValue() < productValidationModel.getE());
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts D() {
        ProductValidationData productValidationData = this.f;
        if (productValidationData != null) {
            return productValidationData.D();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData
    public final boolean E(ProductValidationData productValidationData) {
        if (productValidationData == null) {
            this.f = null;
            return true;
        }
        if (!this.g.values().contains(productValidationData)) {
            return false;
        }
        this.f = productValidationData;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object F(Continuation continuation) {
        String str;
        MultiModalGroupTicketValidationData$getActivationId$1 multiModalGroupTicketValidationData$getActivationId$1 = (MultiModalGroupTicketValidationData$getActivationId$1) continuation;
        int i = multiModalGroupTicketValidationData$getActivationId$1.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            multiModalGroupTicketValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
        } else {
            multiModalGroupTicketValidationData$getActivationId$1 = new MultiModalGroupTicketValidationData$getActivationId$1(this, continuation);
        }
        Object objF = multiModalGroupTicketValidationData$getActivationId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            ProductValidationData productValidationData = this.f;
            if (productValidationData != null) {
                multiModalGroupTicketValidationData$getActivationId$1.label = 1;
                objF = productValidationData.F(multiModalGroupTicketValidationData$getActivationId$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objF);
        str = (String) objF;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData
    public final List G() {
        Collection collectionValues = this.g.values();
        Intrinsics.h(collectionValues, "<get-values>(...)");
        return CollectionsKt.D0(collectionValues);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String a() {
        MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
        String str = multiModalGroupTicketValidationModel != null ? multiModalGroupTicketValidationModel.f5979a : null;
        return str == null ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
        String str = multiModalGroupTicketValidationModel != null ? multiModalGroupTicketValidationModel.b : null;
        return str == null ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ProductValidationData getF() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.e = null;
        this.f = null;
        Collection collectionValues = this.g.values();
        Intrinsics.h(collectionValues, "<get-values>(...)");
        this.g = new LinkedHashMap();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ProductValidationData) it.next()).clear();
        }
        this.h = MapsKt.d();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final boolean d() {
        return ProductValidationData.DefaultImpls.a(this);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ValidationPayloadMetaData e() {
        ProductValidationData productValidationData = this.f;
        if (productValidationData != null) {
            return productValidationData.e();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    /* JADX INFO: renamed from: f */
    public final ProductValidationModel getD() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        String strA;
        MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
        if (multiModalGroupTicketValidationModel != null) {
            strA = this.d.a(multiModalGroupTicketValidationModel.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        } else {
            strA = null;
        }
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
        String str = multiModalGroupTicketValidationModel != null ? multiModalGroupTicketValidationModel.c : null;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r6 == r1) goto L27;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationData$isProductActivationValid$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationData$isProductActivationValid$1 r0 = (app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationData$isProductActivationValid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationData$isProductActivationValid$1 r0 = new app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationData$isProductActivationValid$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L5a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L42
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            java.lang.Object r6 = r5.C(r0)
            if (r6 != r1) goto L42
            goto L59
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4d:
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r6 = r5.f
            if (r6 == 0) goto L61
            r0.label = r3
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L62
        L61:
            r6 = 0
        L62:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationData.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.h = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        ProductValidationData productValidationData = this.f;
        if (productValidationData == null) {
            return 1000L;
        }
        Long lValueOf = Long.valueOf(productValidationData.j());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
        String str = multiModalGroupTicketValidationModel != null ? multiModalGroupTicketValidationModel.f : null;
        return str == null ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long l() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        ProductValidationData productValidationData = this.f;
        String strN = productValidationData != null ? productValidationData.n() : null;
        return strN == null ? "" : strN;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        ProductValidationData productValidationData = this.f;
        if (productValidationData != null) {
            return productValidationData.o(continuationImpl);
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
        if (multiModalGroupTicketValidationModel != null) {
            return multiModalGroupTicketValidationModel.e;
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1 multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1;
        List list;
        if (continuationImpl instanceof MultiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1) {
            multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1 = (MultiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1) continuationImpl;
            int i = multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1 = new MultiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1 = new MultiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1(this, continuationImpl);
        }
        Object objQ = multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1.label;
        if (i2 == 0) {
            ResultKt.b(objQ);
            ProductValidationData productValidationData = this.f;
            if (productValidationData != null) {
                multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1.label = 1;
                objQ = productValidationData.q(multiModalGroupTicketValidationData$getValidationEntityInfoIfAvailable$1);
                if (objQ == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                list = null;
            }
            if (list == null) {
                return EmptyList.f17557a;
            }
            return list;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objQ);
        list = (List) objQ;
        if (list == null) {
            return EmptyList.f17557a;
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1 multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1;
        if (continuationImpl instanceof MultiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1) {
            multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1 = (MultiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1) continuationImpl;
            int i = multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1 = new MultiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1 = new MultiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1(this, continuationImpl);
        }
        Object objR = multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1.label;
        if (i2 == 0) {
            ResultKt.b(objR);
            ProductValidationData productValidationData = this.f;
            if (productValidationData != null) {
                multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1.label = 1;
                objR = productValidationData.r(multiModalGroupTicketValidationData$getProductValidationBrandingLogoType$1);
                if (objR == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return ProductBookingBranding.None.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objR);
        ProductBookingBranding productBookingBranding = (ProductBookingBranding) objR;
        if (productBookingBranding != null) {
            return productBookingBranding;
        }
        return ProductBookingBranding.None.INSTANCE;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        ProductValidationData productValidationData = this.f;
        String strS = productValidationData != null ? productValidationData.s() : null;
        return strS == null ? "" : strS;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationData$getProductDetailsFieldsData$1 multiModalGroupTicketValidationData$getProductDetailsFieldsData$1;
        LinkedHashMap linkedHashMap;
        if (continuationImpl instanceof MultiModalGroupTicketValidationData$getProductDetailsFieldsData$1) {
            multiModalGroupTicketValidationData$getProductDetailsFieldsData$1 = (MultiModalGroupTicketValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i = multiModalGroupTicketValidationData$getProductDetailsFieldsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationData$getProductDetailsFieldsData$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationData$getProductDetailsFieldsData$1 = new MultiModalGroupTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationData$getProductDetailsFieldsData$1 = new MultiModalGroupTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object objB = multiModalGroupTicketValidationData$getProductDetailsFieldsData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationData$getProductDetailsFieldsData$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String strA = TimeUtilsContract.DefaultImpls.a(this.b, p(), null, 6);
            multiModalGroupTicketValidationData$getProductDetailsFieldsData$1.label = 1;
            objB = this.c.b(StringEnum.VALID_TILL_X, new Object[]{strA}, multiModalGroupTicketValidationData$getProductDetailsFieldsData$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        String str = (String) objB;
        MultiModalGroupTicketValidationModel multiModalGroupTicketValidationModel = this.e;
        if (!xs.z(multiModalGroupTicketValidationModel)) {
            multiModalGroupTicketValidationModel = null;
        }
        if (multiModalGroupTicketValidationModel == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = multiModalGroupTicketValidationModel.h;
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = null;
            } else {
                linkedHashMap = linkedHashMap2;
            }
        }
        return new ProductDetailsDisplayData(str, null, null, null, null, null, linkedHashMap, null, null, 446);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.h);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationData$getStaticQRCode$1 multiModalGroupTicketValidationData$getStaticQRCode$1;
        String str;
        if (continuationImpl instanceof MultiModalGroupTicketValidationData$getStaticQRCode$1) {
            multiModalGroupTicketValidationData$getStaticQRCode$1 = (MultiModalGroupTicketValidationData$getStaticQRCode$1) continuationImpl;
            int i = multiModalGroupTicketValidationData$getStaticQRCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationData$getStaticQRCode$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationData$getStaticQRCode$1 = new MultiModalGroupTicketValidationData$getStaticQRCode$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationData$getStaticQRCode$1 = new MultiModalGroupTicketValidationData$getStaticQRCode$1(this, continuationImpl);
        }
        Object objV = multiModalGroupTicketValidationData$getStaticQRCode$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationData$getStaticQRCode$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            ProductValidationData productValidationData = this.f;
            if (productValidationData != null) {
                multiModalGroupTicketValidationData$getStaticQRCode$1.label = 1;
                objV = productValidationData.v(multiModalGroupTicketValidationData$getStaticQRCode$1);
                if (objV == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objV);
        str = (String) objV;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        ProductValidationData productValidationData = this.f;
        if (productValidationData == null) {
            return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        }
        Long lValueOf = Long.valueOf(productValidationData.w());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf.longValue() : ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationData$getActivationTimestampMS$1 multiModalGroupTicketValidationData$getActivationTimestampMS$1;
        long jLongValue;
        if (continuationImpl instanceof MultiModalGroupTicketValidationData$getActivationTimestampMS$1) {
            multiModalGroupTicketValidationData$getActivationTimestampMS$1 = (MultiModalGroupTicketValidationData$getActivationTimestampMS$1) continuationImpl;
            int i = multiModalGroupTicketValidationData$getActivationTimestampMS$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationData$getActivationTimestampMS$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationData$getActivationTimestampMS$1 = new MultiModalGroupTicketValidationData$getActivationTimestampMS$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationData$getActivationTimestampMS$1 = new MultiModalGroupTicketValidationData$getActivationTimestampMS$1(this, continuationImpl);
        }
        Object objX = multiModalGroupTicketValidationData$getActivationTimestampMS$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationData$getActivationTimestampMS$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            ProductValidationData productValidationData = this.f;
            if (productValidationData != null) {
                multiModalGroupTicketValidationData$getActivationTimestampMS$1.label = 1;
                objX = productValidationData.x(multiModalGroupTicketValidationData$getActivationTimestampMS$1);
                if (objX == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                jLongValue = 0;
            }
            return new Long(jLongValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objX);
        jLongValue = ((Number) objX).longValue();
        return new Long(jLongValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        UserDetailsForProducts userDetailsForProductsY;
        ProductValidationData productValidationData = this.f;
        return (productValidationData == null || (userDetailsForProductsY = productValidationData.y()) == null) ? EmptyUserDetailsForProducts.f5978a : userDetailsForProductsY;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        QRValidationType qRValidationTypeZ;
        ProductValidationData productValidationData = this.f;
        return (productValidationData == null || (qRValidationTypeZ = productValidationData.z()) == null) ? QRValidationType.STATIC : qRValidationTypeZ;
    }
}
