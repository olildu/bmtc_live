package app.chalo.ondc.validation.metro;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.ondc.model.app.MetroJourneyOverview;
import app.chalo.ondc.model.app.MetroJourneyStop;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.ticketvalidation.TicketQrSchemaType;
import app.chalo.ticketvalidation.TicketValidationInfo;
import app.chalo.ticketvalidation.TicketValidationInfoKt;
import app.chalo.ticketvalidation.TicketValidationMetaInfo;
import app.chalo.userprofile.Gender;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.ui.JourneyDetailsFieldData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayPassengerFieldData;
import app.chalo.validationsdk.blevalidation.ui.RouteDetailsFieldData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f6814a;
    public final OndcMetroTicketUserDetailsForProducts b;
    public final CurrencyFeature c;
    public final StringProvider d;
    public final TimeUtilsContract e;
    public OndcMetroTicketValidationModel f;
    public Map g = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketValidationData$Companion;", "", "", "EXPIRY_DELAY_PERIODIC_CHECK_MILLIS", "J", "QR_CODE_REFRESH_DELAY_IN_MILLIS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6815a;

        static {
            int[] iArr = new int[TicketQrSchemaType.values().length];
            try {
                iArr[TicketQrSchemaType.DYNAMIC_BMRCL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketQrSchemaType.REGULAR_STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6815a = iArr;
        }
    }

    public OndcMetroTicketValidationData(BasicInfoContract basicInfoContract, OndcMetroTicketUserDetailsForProducts ondcMetroTicketUserDetailsForProducts, CurrencyFeature currencyFeature, StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f6814a = basicInfoContract;
        this.b = ondcMetroTicketUserDetailsForProducts;
        this.c = currencyFeature;
        this.d = stringProvider;
        this.e = timeUtilsContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel d = getD();
        if (d != null) {
            return ((OndcMetroTicketValidationModel) d).getH();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ChaloTransitMode B() {
        return ChaloTransitMode.METRO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object C(ContinuationImpl continuationImpl) {
        OndcMetroTicketValidationData$isValid$1 ondcMetroTicketValidationData$isValid$1;
        ProductValidationModel productValidationModel;
        if (continuationImpl instanceof OndcMetroTicketValidationData$isValid$1) {
            ondcMetroTicketValidationData$isValid$1 = (OndcMetroTicketValidationData$isValid$1) continuationImpl;
            int i = ondcMetroTicketValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationData$isValid$1 = new OndcMetroTicketValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketValidationData$isValid$1 = new OndcMetroTicketValidationData$isValid$1(this, continuationImpl);
        }
        Object obj = ondcMetroTicketValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationData$isValid$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(obj);
            OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
            if (ondcMetroTicketValidationModel != null) {
                ondcMetroTicketValidationData$isValid$1.L$0 = ondcMetroTicketValidationModel;
                ondcMetroTicketValidationData$isValid$1.label = 1;
                Object objC = this.f6814a.c(ondcMetroTicketValidationData$isValid$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productValidationModel = ondcMetroTicketValidationModel;
                obj = objC;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        productValidationModel = (ProductValidationModel) ondcMetroTicketValidationData$isValid$1.L$0;
        ResultKt.b(obj);
        if (((Number) obj).longValue() < productValidationModel.getD()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts D() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object F(Continuation continuation) {
        OndcMetroTicketValidationData$getActivationId$1 ondcMetroTicketValidationData$getActivationId$1;
        if (continuation instanceof OndcMetroTicketValidationData$getActivationId$1) {
            ondcMetroTicketValidationData$getActivationId$1 = (OndcMetroTicketValidationData$getActivationId$1) continuation;
            int i = ondcMetroTicketValidationData$getActivationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationData$getActivationId$1 = new OndcMetroTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationData$getActivationId$1 = new OndcMetroTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
        }
        Object objX = ondcMetroTicketValidationData$getActivationId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            ondcMetroTicketValidationData$getActivationId$1.label = 1;
            objX = x(ondcMetroTicketValidationData$getActivationId$1);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objX);
        }
        return String.valueOf(((Number) objX).longValue() / ((long) 1000));
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String a() {
        return this.f != null ? "mobileTicket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        return this.f != null ? "ondcMetroTicket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.f = null;
        this.g = MapsKt.d();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ boolean d() {
        return ProductValidationData.DefaultImpls.a(this);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ ValidationPayloadMetaData e() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    /* JADX INFO: renamed from: f */
    public final ProductValidationModel getD() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        if (ondcMetroTicketValidationModel == null) {
            return "";
        }
        String strA = this.c.a(ondcMetroTicketValidationModel.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String str;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        return (ondcMetroTicketValidationModel == null || (str = ondcMetroTicketValidationModel.g) == null) ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        OndcMetroTicketValidationData$isProductActivationValid$1 ondcMetroTicketValidationData$isProductActivationValid$1;
        long j;
        if (continuationImpl instanceof OndcMetroTicketValidationData$isProductActivationValid$1) {
            ondcMetroTicketValidationData$isProductActivationValid$1 = (OndcMetroTicketValidationData$isProductActivationValid$1) continuationImpl;
            int i = ondcMetroTicketValidationData$isProductActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationData$isProductActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationData$isProductActivationValid$1 = new OndcMetroTicketValidationData$isProductActivationValid$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketValidationData$isProductActivationValid$1 = new OndcMetroTicketValidationData$isProductActivationValid$1(this, continuationImpl);
        }
        Object objC = ondcMetroTicketValidationData$isProductActivationValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationData$isProductActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            long jP = p();
            ondcMetroTicketValidationData$isProductActivationValid$1.J$0 = jP;
            ondcMetroTicketValidationData$isProductActivationValid$1.label = 1;
            objC = this.f6814a.c(ondcMetroTicketValidationData$isProductActivationValid$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jP;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = ondcMetroTicketValidationData$isProductActivationValid$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(j > ((Number) objC).longValue());
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.g = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        Long l;
        Long l2;
        Long l3;
        List list;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        Long lValueOf = null;
        List listA = (ondcMetroTicketValidationModel == null || (list = ondcMetroTicketValidationModel.n) == null) ? null : TicketValidationInfoKt.a(list);
        if (listA == null) {
            listA = EmptyList.f17557a;
        }
        if (listA.isEmpty()) {
            return 1000L;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            TicketValidationMetaInfo ticketValidationMetaInfo = ((TicketValidationInfo) obj).d;
            TicketQrSchemaType ticketQrSchemaType = ticketValidationMetaInfo != null ? ticketValidationMetaInfo.f9627a : null;
            int i = ticketQrSchemaType == null ? -1 : WhenMappings.f6815a[ticketQrSchemaType.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    arrayList.add(obj);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            TicketValidationMetaInfo ticketValidationMetaInfo2 = ((TicketValidationInfo) obj2).d;
            if (((ticketValidationMetaInfo2 == null || (l3 = ticketValidationMetaInfo2.c) == null) ? 0L : l3.longValue()) > 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            TicketValidationMetaInfo ticketValidationMetaInfo3 = ((TicketValidationInfo) it.next()).d;
            lValueOf = Long.valueOf((ticketValidationMetaInfo3 == null || (l2 = ticketValidationMetaInfo3.c) == null) ? 0L : l2.longValue());
            while (it.hasNext()) {
                TicketValidationMetaInfo ticketValidationMetaInfo4 = ((TicketValidationInfo) it.next()).d;
                Long lValueOf2 = Long.valueOf((ticketValidationMetaInfo4 == null || (l = ticketValidationMetaInfo4.c) == null) ? 0L : l.longValue());
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        }
        return Math.max((lValueOf != null ? lValueOf.longValue() : 0L) * ((long) 1000), 1000L);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        return this.f != null ? "Single Journey Ticket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long l() {
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        if (ondcMetroTicketValidationModel != null) {
            return ondcMetroTicketValidationModel.i;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.f = productValidationModel instanceof OndcMetroTicketValidationModel ? (OndcMetroTicketValidationModel) productValidationModel : null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        String str;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        return (ondcMetroTicketValidationModel == null || (str = ondcMetroTicketValidationModel.g) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        if (ondcMetroTicketValidationModel != null) {
            return ondcMetroTicketValidationModel.c;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        if (ondcMetroTicketValidationModel != null) {
            return ondcMetroTicketValidationModel.d;
        }
        return -1L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        List list;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        return (ondcMetroTicketValidationModel == null || (list = ondcMetroTicketValidationModel.n) == null) ? EmptyList.f17557a : list;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        return new ProductBookingBranding.Ondc();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        String str;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        if (ondcMetroTicketValidationModel == null || (str = ondcMetroTicketValidationModel.g) == null) {
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        OndcMetroTicketValidationData$getProductDetailsFieldsData$1 ondcMetroTicketValidationData$getProductDetailsFieldsData$1;
        String strA;
        int i;
        ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData;
        int i2;
        RouteDetailsFieldData routeDetailsFieldData;
        ArrayList arrayList;
        List list;
        String str;
        MetroJourneyStop metroJourneyStop;
        String str2;
        String str3;
        String str4;
        if (continuationImpl instanceof OndcMetroTicketValidationData$getProductDetailsFieldsData$1) {
            ondcMetroTicketValidationData$getProductDetailsFieldsData$1 = (OndcMetroTicketValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i3 = ondcMetroTicketValidationData$getProductDetailsFieldsData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationData$getProductDetailsFieldsData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationData$getProductDetailsFieldsData$1 = new OndcMetroTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketValidationData$getProductDetailsFieldsData$1 = new OndcMetroTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object obj = ondcMetroTicketValidationData$getProductDetailsFieldsData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = ondcMetroTicketValidationData$getProductDetailsFieldsData$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            OndcMetroTicketUserDetailsForProducts ondcMetroTicketUserDetailsForProducts = this.b;
            ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData2 = new ProductDetailsDisplayPassengerFieldData(ondcMetroTicketUserDetailsForProducts.getE(), ondcMetroTicketUserDetailsForProducts.getC(), ondcMetroTicketUserDetailsForProducts.e(), Gender.Companion.b(Gender.INSTANCE, ondcMetroTicketUserDetailsForProducts.b()));
            strA = TimeUtilsContract.DefaultImpls.a(this.e, p(), null, 2);
            OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
            if ((ondcMetroTicketValidationModel != null ? ondcMetroTicketValidationModel.l : null) == null) {
                i = 0;
            } else if ((ondcMetroTicketValidationModel != null ? ondcMetroTicketValidationModel.m : null) != null) {
                i = 1;
            } else {
                i = 0;
            }
            ondcMetroTicketValidationData$getProductDetailsFieldsData$1.L$0 = productDetailsDisplayPassengerFieldData2;
            ondcMetroTicketValidationData$getProductDetailsFieldsData$1.L$1 = strA;
            ondcMetroTicketValidationData$getProductDetailsFieldsData$1.I$0 = i;
            ondcMetroTicketValidationData$getProductDetailsFieldsData$1.label = 1;
            Object objK = k(ondcMetroTicketValidationData$getProductDetailsFieldsData$1);
            if (objK == obj2) {
                return obj2;
            }
            productDetailsDisplayPassengerFieldData = productDetailsDisplayPassengerFieldData2;
            obj = objK;
            i2 = i;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = ondcMetroTicketValidationData$getProductDetailsFieldsData$1.I$0;
            strA = (String) ondcMetroTicketValidationData$getProductDetailsFieldsData$1.L$1;
            ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData3 = (ProductDetailsDisplayPassengerFieldData) ondcMetroTicketValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(obj);
            productDetailsDisplayPassengerFieldData = productDetailsDisplayPassengerFieldData3;
        }
        String str5 = strA;
        String str6 = (String) obj;
        if (i2 != 0) {
            OndcMetroTicketValidationModel ondcMetroTicketValidationModel2 = this.f;
            routeDetailsFieldData = new RouteDetailsFieldData((ondcMetroTicketValidationModel2 == null || (str4 = ondcMetroTicketValidationModel2.l) == null) ? "" : str4, (ondcMetroTicketValidationModel2 == null || (str3 = ondcMetroTicketValidationModel2.m) == null) ? "" : str3, null, null, "");
        } else {
            routeDetailsFieldData = null;
        }
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel3 = this.f;
        if (ondcMetroTicketValidationModel3 == null || (list = ondcMetroTicketValidationModel3.o) == null) {
            arrayList = null;
        } else {
            List<MetroJourneyOverview> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
            for (MetroJourneyOverview metroJourneyOverview : list2) {
                List list3 = metroJourneyOverview.c;
                if (list3.size() > 1) {
                    String str7 = metroJourneyOverview.b;
                    String str8 = metroJourneyOverview.f6762a;
                    if (str8.length() <= 0) {
                        str8 = null;
                    }
                    MetroJourneyStop metroJourneyStop2 = (MetroJourneyStop) CollectionsKt.H(list3);
                    if (metroJourneyStop2 != null && (str = metroJourneyStop2.b) != null && (metroJourneyStop = (MetroJourneyStop) CollectionsKt.Q(list3)) != null && (str2 = metroJourneyStop.b) != null) {
                        arrayList2.add(new JourneyDetailsFieldData(str7, str8, str, str2));
                    }
                }
                arrayList2 = null;
            }
            arrayList = arrayList2;
        }
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel4 = this.f;
        return new ProductDetailsDisplayData(str5, productDetailsDisplayPassengerFieldData, null, null, routeDetailsFieldData, str6, ondcMetroTicketValidationModel4 != null ? ondcMetroTicketValidationModel4.j : null, null, arrayList, 128);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.g);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        String str;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        return (ondcMetroTicketValidationModel == null || (str = ondcMetroTicketValidationModel.b) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        long jLongValue;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        if (ondcMetroTicketValidationModel != null) {
            jLongValue = ondcMetroTicketValidationModel.d - ondcMetroTicketValidationModel.e.longValue();
        } else {
            jLongValue = 0;
        }
        return new Long(jLongValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        List list;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = this.f;
        List listA = (ondcMetroTicketValidationModel == null || (list = ondcMetroTicketValidationModel.n) == null) ? null : TicketValidationInfoKt.a(list);
        if (listA == null) {
            listA = EmptyList.f17557a;
        }
        if (listA.isEmpty()) {
            return QRValidationType.STATIC;
        }
        List list2 = listA;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    TicketValidationMetaInfo ticketValidationMetaInfo = ((TicketValidationInfo) it.next()).d;
                    TicketQrSchemaType ticketQrSchemaType = ticketValidationMetaInfo != null ? ticketValidationMetaInfo.f9627a : null;
                    int i = ticketQrSchemaType == null ? -1 : WhenMappings.f6815a[ticketQrSchemaType.ordinal()];
                    if (i == -1) {
                        break;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            break;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if (!z || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    TicketValidationMetaInfo ticketValidationMetaInfo2 = ((TicketValidationInfo) it2.next()).d;
                    TicketQrSchemaType ticketQrSchemaType2 = ticketValidationMetaInfo2 != null ? ticketValidationMetaInfo2.f9627a : null;
                    int i2 = ticketQrSchemaType2 == null ? -1 : WhenMappings.f6815a[ticketQrSchemaType2.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            return QRValidationType.STATIC;
                        }
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return QRValidationType.STATIC;
        }
        return QRValidationType.DYNAMIC;
    }
}
