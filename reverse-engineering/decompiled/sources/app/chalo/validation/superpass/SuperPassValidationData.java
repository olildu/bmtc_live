package app.chalo.validation.superpass;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.data.ProductBookingBranding;
import app.chalo.extensions.PrimitiveDataTypeExtentionsKt;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.utils.ChaloConfigUtils;
import app.chalo.userprofile.Gender;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayPassengerFieldData;
import defpackage.d;
import defpackage.uf0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;
import kotlinx.datetime.format.LocalDateTimeFormat;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AppendableFormatStructure;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validation/superpass/SuperPassValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyFeature f10466a;
    public final StringProvider b;
    public final CityProvider c;
    public final TimeUtilsContract d;
    public ProductValidationModel e;
    public Object f = MapsKt.d();
    public Map g = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/validation/superpass/SuperPassValidationData$Companion;", "", "", "PASS_ACTIVATION_EXPIRY_DELAY_PERIODIC_CHECK_MILLIS", "J", "QR_CODE_REFRESH_DELAY_IN_MILLIS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SuperPassValidationData(CurrencyFeature currencyFeature, StringProvider stringProvider, CityProvider cityProvider, TimeUtilsContract timeUtilsContract, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase) {
        this.f10466a = currencyFeature;
        this.b = stringProvider;
        this.c = cityProvider;
        this.d = timeUtilsContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel productValidationModel = this.e;
        if (productValidationModel != null) {
            return productValidationModel.getJ();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ChaloTransitMode B() {
        return ChaloTransitMode.BUS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object C(ContinuationImpl continuationImpl) {
        SuperPassValidationData$isValid$1 superPassValidationData$isValid$1;
        boolean zBooleanValue;
        if (continuationImpl instanceof SuperPassValidationData$isValid$1) {
            superPassValidationData$isValid$1 = (SuperPassValidationData$isValid$1) continuationImpl;
            int i = superPassValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationData$isValid$1 = new SuperPassValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            superPassValidationData$isValid$1 = new SuperPassValidationData$isValid$1(this, continuationImpl);
        }
        Object objInvoke = superPassValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationData$isValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            ProductValidationModel productValidationModel = this.e;
            SuperPassProductValidationModel superPassProductValidationModel = productValidationModel instanceof SuperPassProductValidationModel ? (SuperPassProductValidationModel) productValidationModel : null;
            if (superPassProductValidationModel != null) {
                Function1 function1 = superPassProductValidationModel.p;
                superPassValidationData$isValid$1.label = 1;
                objInvoke = ((SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2) function1).invoke(superPassValidationData$isValid$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objInvoke);
        zBooleanValue = ((Boolean) objInvoke).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts D() {
        ProductValidationModel productValidationModel = this.e;
        SuperPassProductValidationModel superPassProductValidationModel = productValidationModel instanceof SuperPassProductValidationModel ? (SuperPassProductValidationModel) productValidationModel : null;
        if (superPassProductValidationModel != null) {
            return superPassProductValidationModel.l;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object F(Continuation continuation) {
        SuperPassValidationData$getActivationId$1 superPassValidationData$getActivationId$1;
        if (continuation instanceof SuperPassValidationData$getActivationId$1) {
            superPassValidationData$getActivationId$1 = (SuperPassValidationData$getActivationId$1) continuation;
            int i = superPassValidationData$getActivationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationData$getActivationId$1 = new SuperPassValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
            }
        } else {
            superPassValidationData$getActivationId$1 = new SuperPassValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
        }
        Object objX = superPassValidationData$getActivationId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            superPassValidationData$getActivationId$1.label = 1;
            objX = x(superPassValidationData$getActivationId$1);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(SuperPassProductValidationModel superPassProductValidationModel, ContinuationImpl continuationImpl) {
        SuperPassValidationData$getMaxFarePerTripFieldData$1 superPassValidationData$getMaxFarePerTripFieldData$1;
        String str;
        String str2;
        if (continuationImpl instanceof SuperPassValidationData$getMaxFarePerTripFieldData$1) {
            superPassValidationData$getMaxFarePerTripFieldData$1 = (SuperPassValidationData$getMaxFarePerTripFieldData$1) continuationImpl;
            int i = superPassValidationData$getMaxFarePerTripFieldData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationData$getMaxFarePerTripFieldData$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationData$getMaxFarePerTripFieldData$1 = new SuperPassValidationData$getMaxFarePerTripFieldData$1(this, continuationImpl);
            }
        } else {
            superPassValidationData$getMaxFarePerTripFieldData$1 = new SuperPassValidationData$getMaxFarePerTripFieldData$1(this, continuationImpl);
        }
        Object objB = superPassValidationData$getMaxFarePerTripFieldData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationData$getMaxFarePerTripFieldData$1.label;
        StringProvider stringProvider = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) superPassValidationData$getMaxFarePerTripFieldData$1.L$0;
                ResultKt.b(objB);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) superPassValidationData$getMaxFarePerTripFieldData$1.L$0;
                ResultKt.b(objB);
            }
            return new ProductDetailsDisplayFieldData(str2, (String) objB);
        }
        ResultKt.b(objB);
        if (superPassProductValidationModel.o == -1.0d) {
            return null;
        }
        str = this.f10466a.d() + ((int) superPassProductValidationModel.o);
        superPassValidationData$getMaxFarePerTripFieldData$1.L$0 = str;
        superPassValidationData$getMaxFarePerTripFieldData$1.label = 1;
        objB = stringProvider.b(StringEnum.MAX_FARE_COPY, new Object[0], superPassValidationData$getMaxFarePerTripFieldData$1);
        if (objB != coroutineSingletons) {
        }
        return coroutineSingletons;
        String str3 = (String) objB;
        superPassValidationData$getMaxFarePerTripFieldData$1.L$0 = str3;
        superPassValidationData$getMaxFarePerTripFieldData$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.UPTO_X, new Object[]{str}, superPassValidationData$getMaxFarePerTripFieldData$1);
        if (objB2 != coroutineSingletons) {
            objB = objB2;
            str2 = str3;
            return new ProductDetailsDisplayFieldData(str2, (String) objB);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [byte[], java.io.Serializable] */
    public final Serializable I(long j, String str, ContinuationImpl continuationImpl) {
        SuperPassValidationData$getPayloadForTone$1 superPassValidationData$getPayloadForTone$1;
        if (continuationImpl instanceof SuperPassValidationData$getPayloadForTone$1) {
            superPassValidationData$getPayloadForTone$1 = (SuperPassValidationData$getPayloadForTone$1) continuationImpl;
            int i = superPassValidationData$getPayloadForTone$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationData$getPayloadForTone$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationData$getPayloadForTone$1 = new SuperPassValidationData$getPayloadForTone$1(this, continuationImpl);
            }
        } else {
            superPassValidationData$getPayloadForTone$1 = new SuperPassValidationData$getPayloadForTone$1(this, continuationImpl);
        }
        Object objE = superPassValidationData$getPayloadForTone$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationData$getPayloadForTone$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            ChaloConfigUtils chaloConfigUtils = ChaloConfigUtils.f9611a;
            superPassValidationData$getPayloadForTone$1.L$0 = str;
            superPassValidationData$getPayloadForTone$1.J$0 = j;
            superPassValidationData$getPayloadForTone$1.label = 1;
            objE = chaloConfigUtils.e(superPassValidationData$getPayloadForTone$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) superPassValidationData$getPayloadForTone$1.L$0;
            ResultKt.b(objE);
        }
        if (!((Boolean) objE).booleanValue()) {
            return Base64.b(Base64.f, str, 0, 6);
        }
        return ArraysKt.b0(Base64.b(Base64.f, str, 0, 6), PrimitiveDataTypeExtentionsKt.a((int) this.d.A(), 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        if (r11 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(app.chalo.validation.superpass.SuperPassProductValidationModel r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof app.chalo.validation.superpass.SuperPassValidationData$getRemainingTripsFieldData$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.validation.superpass.SuperPassValidationData$getRemainingTripsFieldData$1 r0 = (app.chalo.validation.superpass.SuperPassValidationData$getRemainingTripsFieldData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validation.superpass.SuperPassValidationData$getRemainingTripsFieldData$1 r0 = new app.chalo.validation.superpass.SuperPassValidationData$getRemainingTripsFieldData$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            app.chalo.providers.stringprovider.StringProvider r8 = r9.b
            if (r2 == 0) goto L4c
            if (r2 == r7) goto L48
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.b(r11)
            goto Lb7
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            kotlin.ResultKt.b(r11)
            goto La5
        L44:
            kotlin.ResultKt.b(r11)
            goto L89
        L48:
            kotlin.ResultKt.b(r11)
            goto L70
        L4c:
            kotlin.ResultKt.b(r11)
            int r11 = r10.n
            int r10 = r10.m
            r2 = -1
            if (r11 != r2) goto L5b
            if (r10 == r2) goto L59
            goto L5b
        L59:
            r10 = 0
            return r10
        L5b:
            if (r11 != r2) goto L74
            app.chalo.providers.stringprovider.StringEnum r10 = app.chalo.providers.stringprovider.StringEnum.TRIP_COUNT_DETAILS_ACTIVATE_SCREEN_ONLY_DAILY_LIMIT
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r3] = r11
            r0.label = r7
            java.lang.Object r11 = r8.b(r10, r2, r0)
            if (r11 != r1) goto L70
            goto Lb6
        L70:
            java.lang.String r11 = (java.lang.String) r11
        L72:
            r10 = r11
            goto La8
        L74:
            if (r10 != r2) goto L8c
            app.chalo.providers.stringprovider.StringEnum r10 = app.chalo.providers.stringprovider.StringEnum.TRIP_COUNT_DETAILS_ACTIVATE_SCREEN_NO_DAILY_LIMIT
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r3] = r11
            r0.label = r6
            java.lang.Object r11 = r8.b(r10, r2, r0)
            if (r11 != r1) goto L89
            goto Lb6
        L89:
            java.lang.String r11 = (java.lang.String) r11
            goto L72
        L8c:
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.TRIP_COUNT_DETAILS_ACTIVATE_SCREEN
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r11
            r6[r7] = r10
            r0.label = r5
            java.lang.Object r11 = r8.b(r2, r6, r0)
            if (r11 != r1) goto La5
            goto Lb6
        La5:
            java.lang.String r11 = (java.lang.String) r11
            goto L72
        La8:
            app.chalo.providers.stringprovider.StringEnum r11 = app.chalo.providers.stringprovider.StringEnum.TRIPS_REMAINING
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r11 = r8.b(r11, r2, r0)
            if (r11 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            java.lang.String r11 = (java.lang.String) r11
            app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData r0 = new app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData
            r0.<init>(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validation.superpass.SuperPassValidationData.J(app.chalo.validation.superpass.SuperPassProductValidationModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String a() {
        String i;
        ProductValidationModel productValidationModel = this.e;
        return (productValidationModel == null || (i = productValidationModel.getI()) == null) ? "" : i;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        String j;
        ProductValidationModel productValidationModel = this.e;
        return (productValidationModel == null || (j = productValidationModel.getJ()) == null) ? "" : j;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.e = null;
        this.f = MapsKt.d();
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
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ProductValidationModel getE() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        ProductValidationModel productValidationModel = this.e;
        if (productValidationModel == null) {
            return "";
        }
        String strA = this.f10466a.a(productValidationModel.getG() * 100, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String h;
        ProductValidationModel productValidationModel = this.e;
        return (productValidationModel == null || (h = productValidationModel.getH()) == null) ? "" : h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        SuperPassValidationData$isProductActivationValid$1 superPassValidationData$isProductActivationValid$1;
        boolean zBooleanValue;
        if (continuationImpl instanceof SuperPassValidationData$isProductActivationValid$1) {
            superPassValidationData$isProductActivationValid$1 = (SuperPassValidationData$isProductActivationValid$1) continuationImpl;
            int i = superPassValidationData$isProductActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationData$isProductActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationData$isProductActivationValid$1 = new SuperPassValidationData$isProductActivationValid$1(this, continuationImpl);
            }
        } else {
            superPassValidationData$isProductActivationValid$1 = new SuperPassValidationData$isProductActivationValid$1(this, continuationImpl);
        }
        Object objInvoke = superPassValidationData$isProductActivationValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationData$isProductActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            ProductValidationModel productValidationModel = this.e;
            SuperPassProductValidationModel superPassProductValidationModel = productValidationModel instanceof SuperPassProductValidationModel ? (SuperPassProductValidationModel) productValidationModel : null;
            if (superPassProductValidationModel != null) {
                Function1 function1 = superPassProductValidationModel.r;
                superPassValidationData$isProductActivationValid$1.label = 1;
                objInvoke = ((SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4) function1).invoke(superPassValidationData$isProductActivationValid$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objInvoke);
        zBooleanValue = ((Boolean) objInvoke).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.f = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        String k;
        ProductValidationModel productValidationModel = this.e;
        return (productValidationModel == null || (k = productValidationModel.getK()) == null) ? "" : k;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ Long l() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.e = productValidationModel;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        String h;
        ProductValidationModel productValidationModel = this.e;
        return (productValidationModel == null || (h = productValidationModel.getH()) == null) ? "" : h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        ProductValidationModel productValidationModel = this.e;
        if (productValidationModel != null) {
            return productValidationModel.getD();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        ProductValidationModel productValidationModel = this.e;
        if (productValidationModel != null) {
            return productValidationModel.getE();
        }
        return 0L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        return EmptyList.f17557a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        String str;
        ProductValidationModel productValidationModel = this.e;
        boolean z = productValidationModel instanceof SuperPassProductValidationModel;
        SuperPassProductValidationModel superPassProductValidationModel = z ? (SuperPassProductValidationModel) productValidationModel : null;
        if (superPassProductValidationModel == null) {
            return ProductBookingBranding.None.INSTANCE;
        }
        if (!superPassProductValidationModel.u) {
            return ProductBookingBranding.None.INSTANCE;
        }
        SuperPassProductValidationModel superPassProductValidationModel2 = z ? (SuperPassProductValidationModel) productValidationModel : null;
        if (superPassProductValidationModel2 == null) {
            return ProductBookingBranding.None.INSTANCE;
        }
        String str2 = superPassProductValidationModel2.s;
        SuperPassProductValidationModel superPassProductValidationModel3 = z ? (SuperPassProductValidationModel) productValidationModel : null;
        if (superPassProductValidationModel3 == null || (str = superPassProductValidationModel3.t) == null) {
            return ProductBookingBranding.None.INSTANCE;
        }
        ProductBookingBranding.INSTANCE.getClass();
        return ProductBookingBranding.Companion.a(str2, str);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        String h;
        ProductValidationModel productValidationModel = this.e;
        if (productValidationModel == null || (h = productValidationModel.getH()) == null) {
            return "";
        }
        String upperCase = h.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x012a A[Catch: Exception -> 0x0146, TryCatch #0 {Exception -> 0x0146, blocks: (B:33:0x00ef, B:35:0x012a, B:38:0x0130), top: B:47:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        SuperPassValidationData$getProductDetailsFieldsData$1 superPassValidationData$getProductDetailsFieldsData$1;
        Ref.ObjectRef objectRefV;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        T t;
        SuperPassProductValidationModel superPassProductValidationModel;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        String strR;
        ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData;
        String strG;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData2;
        Object objK;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData3;
        String str;
        ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData2;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData4;
        Object obj;
        CityAppModel cityAppModel;
        String str2;
        T t2;
        if (continuationImpl instanceof SuperPassValidationData$getProductDetailsFieldsData$1) {
            superPassValidationData$getProductDetailsFieldsData$1 = (SuperPassValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i = superPassValidationData$getProductDetailsFieldsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationData$getProductDetailsFieldsData$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationData$getProductDetailsFieldsData$1 = new SuperPassValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            superPassValidationData$getProductDetailsFieldsData$1 = new SuperPassValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object obj2 = superPassValidationData$getProductDetailsFieldsData$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationData$getProductDetailsFieldsData$1.label;
        if (i2 == 0) {
            objectRefV = uf0.v(obj2);
            objectRef = new Ref.ObjectRef();
            ProductValidationModel productValidationModel = this.e;
            SuperPassProductValidationModel superPassProductValidationModel2 = productValidationModel instanceof SuperPassProductValidationModel ? (SuperPassProductValidationModel) productValidationModel : null;
            if (superPassProductValidationModel2 != null) {
                superPassValidationData$getProductDetailsFieldsData$1.L$0 = objectRefV;
                superPassValidationData$getProductDetailsFieldsData$1.L$1 = objectRef;
                superPassValidationData$getProductDetailsFieldsData$1.L$2 = superPassProductValidationModel2;
                superPassValidationData$getProductDetailsFieldsData$1.L$3 = objectRefV;
                superPassValidationData$getProductDetailsFieldsData$1.label = 1;
                Object objJ = J(superPassProductValidationModel2, superPassValidationData$getProductDetailsFieldsData$1);
                if (objJ != obj3) {
                    SuperPassProductValidationModel superPassProductValidationModel3 = superPassProductValidationModel2;
                    objectRef2 = objectRef;
                    t = objJ;
                    superPassProductValidationModel = superPassProductValidationModel3;
                    objectRef3 = objectRefV;
                }
            } else {
                long jP = p();
                TimeUtilsContract timeUtilsContract = this.d;
                String expiryString = TimeUtilsContract.DefaultImpls.a(timeUtilsContract, jP, null, 6);
                Intrinsics.i(expiryString, "expiryString");
                strR = StringsKt.R(expiryString, ",", " on");
                String str3 = ((SuperPassUserDetailsForProducts) y()).f10464a.g;
                String str4 = ((SuperPassUserDetailsForProducts) y()).f10464a.c;
                String strE = ((SuperPassUserDetailsForProducts) y()).e();
                LocalDateTime.INSTANCE.getClass();
                LocalDateTimeFormat.Builder builder = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                builder.w(Padding.ZERO);
                builder.e("/");
                builder.a(Padding.ZERO);
                builder.e("/");
                builder.t(Padding.ZERO);
                LocalDateTime localDateTimeB = LocalDateTime.Companion.b(strE, new LocalDateTimeFormat(d.c(builder)));
                cityAppModel = (CityAppModel) this.c.getE().getValue();
                if (cityAppModel != null) {
                    str2 = "Asia/Kolkata";
                } else {
                    str2 = "Asia/Kolkata";
                }
                TimeZone.INSTANCE.getClass();
                strG = timeUtilsContract.g(TimeZoneKt.a(localDateTimeB, TimeZone.Companion.a(str2)).f());
                productDetailsDisplayPassengerFieldData = new ProductDetailsDisplayPassengerFieldData(str3, str4, strG, Gender.Companion.b(Gender.INSTANCE, ((SuperPassUserDetailsForProducts) y()).b()));
                productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) objectRefV.element;
                productDetailsDisplayFieldData2 = (ProductDetailsDisplayFieldData) objectRef.element;
                superPassValidationData$getProductDetailsFieldsData$1.L$0 = strR;
                superPassValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayPassengerFieldData;
                superPassValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData;
                superPassValidationData$getProductDetailsFieldsData$1.L$3 = productDetailsDisplayFieldData2;
                superPassValidationData$getProductDetailsFieldsData$1.label = 3;
                objK = k(superPassValidationData$getProductDetailsFieldsData$1);
                if (objK != obj3) {
                    productDetailsDisplayFieldData3 = productDetailsDisplayFieldData;
                    str = strR;
                    productDetailsDisplayPassengerFieldData2 = productDetailsDisplayPassengerFieldData;
                    productDetailsDisplayFieldData4 = productDetailsDisplayFieldData2;
                    obj = objK;
                    return new ProductDetailsDisplayData(str, productDetailsDisplayPassengerFieldData2, productDetailsDisplayFieldData3, productDetailsDisplayFieldData4, null, (String) obj, null, null, null, 464);
                }
            }
            return obj3;
        }
        if (i2 == 1) {
            objectRefV = (Ref.ObjectRef) superPassValidationData$getProductDetailsFieldsData$1.L$3;
            superPassProductValidationModel = (SuperPassProductValidationModel) superPassValidationData$getProductDetailsFieldsData$1.L$2;
            objectRef2 = (Ref.ObjectRef) superPassValidationData$getProductDetailsFieldsData$1.L$1;
            objectRef3 = (Ref.ObjectRef) superPassValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(obj2);
            t = obj2;
        } else {
            if (i2 == 2) {
                objectRef4 = (Ref.ObjectRef) superPassValidationData$getProductDetailsFieldsData$1.L$2;
                objectRef5 = (Ref.ObjectRef) superPassValidationData$getProductDetailsFieldsData$1.L$1;
                objectRef6 = (Ref.ObjectRef) superPassValidationData$getProductDetailsFieldsData$1.L$0;
                ResultKt.b(obj2);
                t2 = obj2;
                objectRef4.element = t2;
                objectRef = objectRef5;
                objectRefV = objectRef6;
                long jP2 = p();
                TimeUtilsContract timeUtilsContract2 = this.d;
                String expiryString2 = TimeUtilsContract.DefaultImpls.a(timeUtilsContract2, jP2, null, 6);
                Intrinsics.i(expiryString2, "expiryString");
                strR = StringsKt.R(expiryString2, ",", " on");
                String str5 = ((SuperPassUserDetailsForProducts) y()).f10464a.g;
                String str6 = ((SuperPassUserDetailsForProducts) y()).f10464a.c;
                String strE2 = ((SuperPassUserDetailsForProducts) y()).e();
                try {
                    LocalDateTime.INSTANCE.getClass();
                    LocalDateTimeFormat.Builder builder2 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                    builder2.w(Padding.ZERO);
                    builder2.e("/");
                    builder2.a(Padding.ZERO);
                    builder2.e("/");
                    builder2.t(Padding.ZERO);
                    LocalDateTime localDateTimeB2 = LocalDateTime.Companion.b(strE2, new LocalDateTimeFormat(d.c(builder2)));
                    cityAppModel = (CityAppModel) this.c.getE().getValue();
                    if (cityAppModel != null || (str2 = cityAppModel.l) == null) {
                        str2 = "Asia/Kolkata";
                    }
                    TimeZone.INSTANCE.getClass();
                    strG = timeUtilsContract2.g(TimeZoneKt.a(localDateTimeB2, TimeZone.Companion.a(str2)).f());
                } catch (Exception unused) {
                    strG = "";
                }
                productDetailsDisplayPassengerFieldData = new ProductDetailsDisplayPassengerFieldData(str5, str6, strG, Gender.Companion.b(Gender.INSTANCE, ((SuperPassUserDetailsForProducts) y()).b()));
                productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) objectRefV.element;
                productDetailsDisplayFieldData2 = (ProductDetailsDisplayFieldData) objectRef.element;
                superPassValidationData$getProductDetailsFieldsData$1.L$0 = strR;
                superPassValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayPassengerFieldData;
                superPassValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData;
                superPassValidationData$getProductDetailsFieldsData$1.L$3 = productDetailsDisplayFieldData2;
                superPassValidationData$getProductDetailsFieldsData$1.label = 3;
                objK = k(superPassValidationData$getProductDetailsFieldsData$1);
                if (objK != obj3) {
                    productDetailsDisplayFieldData3 = productDetailsDisplayFieldData;
                    str = strR;
                    productDetailsDisplayPassengerFieldData2 = productDetailsDisplayPassengerFieldData;
                    productDetailsDisplayFieldData4 = productDetailsDisplayFieldData2;
                    obj = objK;
                }
                return obj3;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductDetailsDisplayFieldData productDetailsDisplayFieldData5 = (ProductDetailsDisplayFieldData) superPassValidationData$getProductDetailsFieldsData$1.L$3;
            ProductDetailsDisplayFieldData productDetailsDisplayFieldData6 = (ProductDetailsDisplayFieldData) superPassValidationData$getProductDetailsFieldsData$1.L$2;
            ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData3 = (ProductDetailsDisplayPassengerFieldData) superPassValidationData$getProductDetailsFieldsData$1.L$1;
            String str7 = (String) superPassValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(obj2);
            productDetailsDisplayFieldData3 = productDetailsDisplayFieldData6;
            productDetailsDisplayPassengerFieldData2 = productDetailsDisplayPassengerFieldData3;
            productDetailsDisplayFieldData4 = productDetailsDisplayFieldData5;
            str = str7;
            obj = obj2;
        }
        return new ProductDetailsDisplayData(str, productDetailsDisplayPassengerFieldData2, productDetailsDisplayFieldData3, productDetailsDisplayFieldData4, null, (String) obj, null, null, null, 464);
        objectRefV.element = t;
        superPassValidationData$getProductDetailsFieldsData$1.L$0 = objectRef3;
        superPassValidationData$getProductDetailsFieldsData$1.L$1 = objectRef2;
        superPassValidationData$getProductDetailsFieldsData$1.L$2 = objectRef2;
        superPassValidationData$getProductDetailsFieldsData$1.L$3 = null;
        superPassValidationData$getProductDetailsFieldsData$1.label = 2;
        Object objH = H(superPassProductValidationModel, superPassValidationData$getProductDetailsFieldsData$1);
        if (objH != obj3) {
            objectRef4 = objectRef2;
            objectRef5 = objectRef4;
            objectRef6 = objectRef3;
            t2 = objH;
            objectRef4.element = t2;
            objectRef = objectRef5;
            objectRefV = objectRef6;
            long jP3 = p();
            TimeUtilsContract timeUtilsContract3 = this.d;
            String expiryString3 = TimeUtilsContract.DefaultImpls.a(timeUtilsContract3, jP3, null, 6);
            Intrinsics.i(expiryString3, "expiryString");
            strR = StringsKt.R(expiryString3, ",", " on");
            String str8 = ((SuperPassUserDetailsForProducts) y()).f10464a.g;
            String str9 = ((SuperPassUserDetailsForProducts) y()).f10464a.c;
            String strE3 = ((SuperPassUserDetailsForProducts) y()).e();
            LocalDateTime.INSTANCE.getClass();
            LocalDateTimeFormat.Builder builder3 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
            builder3.w(Padding.ZERO);
            builder3.e("/");
            builder3.a(Padding.ZERO);
            builder3.e("/");
            builder3.t(Padding.ZERO);
            LocalDateTime localDateTimeB3 = LocalDateTime.Companion.b(strE3, new LocalDateTimeFormat(d.c(builder3)));
            cityAppModel = (CityAppModel) this.c.getE().getValue();
            if (cityAppModel != null) {
                str2 = "Asia/Kolkata";
            } else {
                str2 = "Asia/Kolkata";
            }
            TimeZone.INSTANCE.getClass();
            strG = timeUtilsContract3.g(TimeZoneKt.a(localDateTimeB3, TimeZone.Companion.a(str2)).f());
            productDetailsDisplayPassengerFieldData = new ProductDetailsDisplayPassengerFieldData(str8, str9, strG, Gender.Companion.b(Gender.INSTANCE, ((SuperPassUserDetailsForProducts) y()).b()));
            productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) objectRefV.element;
            productDetailsDisplayFieldData2 = (ProductDetailsDisplayFieldData) objectRef.element;
            superPassValidationData$getProductDetailsFieldsData$1.L$0 = strR;
            superPassValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayPassengerFieldData;
            superPassValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData;
            superPassValidationData$getProductDetailsFieldsData$1.L$3 = productDetailsDisplayFieldData2;
            superPassValidationData$getProductDetailsFieldsData$1.label = 3;
            objK = k(superPassValidationData$getProductDetailsFieldsData$1);
            if (objK != obj3) {
                productDetailsDisplayFieldData3 = productDetailsDisplayFieldData;
                str = strR;
                productDetailsDisplayPassengerFieldData2 = productDetailsDisplayPassengerFieldData;
                productDetailsDisplayFieldData4 = productDetailsDisplayFieldData2;
                obj = objK;
                return new ProductDetailsDisplayData(str, productDetailsDisplayPassengerFieldData2, productDetailsDisplayFieldData3, productDetailsDisplayFieldData4, null, (String) obj, null, null, null, 464);
            }
        }
        return obj3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.f);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        String c;
        ProductValidationModel productValidationModel = this.e;
        return (productValidationModel == null || (c = productValidationModel.getC()) == null) ? "" : c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        SuperPassValidationData$getActivationTimestampMS$1 superPassValidationData$getActivationTimestampMS$1;
        long jLongValue;
        if (continuationImpl instanceof SuperPassValidationData$getActivationTimestampMS$1) {
            superPassValidationData$getActivationTimestampMS$1 = (SuperPassValidationData$getActivationTimestampMS$1) continuationImpl;
            int i = superPassValidationData$getActivationTimestampMS$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationData$getActivationTimestampMS$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationData$getActivationTimestampMS$1 = new SuperPassValidationData$getActivationTimestampMS$1(this, continuationImpl);
            }
        } else {
            superPassValidationData$getActivationTimestampMS$1 = new SuperPassValidationData$getActivationTimestampMS$1(this, continuationImpl);
        }
        Object objInvoke = superPassValidationData$getActivationTimestampMS$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationData$getActivationTimestampMS$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            ProductValidationModel productValidationModel = this.e;
            SuperPassProductValidationModel superPassProductValidationModel = productValidationModel instanceof SuperPassProductValidationModel ? (SuperPassProductValidationModel) productValidationModel : null;
            if (superPassProductValidationModel != null) {
                Function1 function1 = superPassProductValidationModel.q;
                superPassValidationData$getActivationTimestampMS$1.label = 1;
                objInvoke = ((SuperPassProductValidationModelKt$toSuperPassProductValidationModel$3) function1).invoke(superPassValidationData$getActivationTimestampMS$1);
                if (objInvoke == coroutineSingletons) {
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
        ResultKt.b(objInvoke);
        jLongValue = ((Number) objInvoke).longValue();
        return new Long(jLongValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        SuperPassUserDetailsForProducts superPassUserDetailsForProducts;
        ProductValidationModel productValidationModel = this.e;
        SuperPassProductValidationModel superPassProductValidationModel = productValidationModel instanceof SuperPassProductValidationModel ? (SuperPassProductValidationModel) productValidationModel : null;
        return (superPassProductValidationModel == null || (superPassUserDetailsForProducts = superPassProductValidationModel.l) == null) ? new SuperPassUserDetailsForProducts(new SuperPassUserDetails((String) null, (String) null, (String) null, Gender.NULL, (String) null, (String) null, (String) null, 247), this.d) : superPassUserDetailsForProducts;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        return QRValidationType.DYNAMIC;
    }
}
