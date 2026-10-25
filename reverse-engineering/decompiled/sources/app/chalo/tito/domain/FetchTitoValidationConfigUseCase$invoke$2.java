package app.chalo.tito.domain;

import app.chalo.buildconfig.ProductFlavor;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProductKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.tito.data.model.TITONotificationJobConfig;
import app.chalo.tito.data.model.TitoValidationCityWiseConfig;
import app.chalo.tito.data.model.TitoValidationCityWiseConfigData;
import app.chalo.tito.data.model.TitoValidationConfigData;
import app.chalo.tito.data.model.TitoValidationConstraint;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/tito/data/model/TitoValidationConfigData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tito.domain.FetchTitoValidationConfigUseCase$invoke$2", f = "FetchTitoValidationConfigUseCase.kt", l = {44, 48, 53}, m = "invokeSuspend", v = 1)
final class FetchTitoValidationConfigUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TitoValidationConfigData>, Object> {
    final /* synthetic */ ValidationProduct $validationProduct;
    Object L$0;
    int label;
    final /* synthetic */ FetchTitoValidationConfigUseCase this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9653a;

        static {
            int[] iArr = new int[ProductFlavor.values().length];
            try {
                iArr[ProductFlavor.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductFlavor.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductFlavor.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9653a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchTitoValidationConfigUseCase$invoke$2(ValidationProduct validationProduct, FetchTitoValidationConfigUseCase fetchTitoValidationConfigUseCase, Continuation continuation) {
        super(2, continuation);
        this.$validationProduct = validationProduct;
        this.this$0 = fetchTitoValidationConfigUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchTitoValidationConfigUseCase$invoke$2(this.$validationProduct, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchTitoValidationConfigUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0171  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        String str;
        String str2;
        TitoValidationCityWiseConfig titoValidationCityWiseConfig;
        TitoValidationConfigData titoValidationConfigData;
        Object next;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Pair pairA = ValidationProductKt.a(this.$validationProduct);
            TitoValidationConfigData titoValidationConfigData2 = (TitoValidationConfigData) this.this$0.g.get(pairA);
            if (titoValidationConfigData2 != null) {
                return titoValidationConfigData2;
            }
            if (this.this$0.f.f()) {
                ChaloConfigFeature chaloConfigFeature = this.this$0.f9652a;
                this.L$0 = pairA;
                this.label = 1;
                Object objA = chaloConfigFeature.a("titoValidationConfigDev", this);
                if (objA != coroutineSingletons) {
                    pair = pairA;
                    obj = objA;
                    str = (String) obj;
                }
            } else {
                int i2 = WhenMappings.f9653a[this.this$0.d.getB().ordinal()];
                if (i2 == 1) {
                    ChaloConfigFeature chaloConfigFeature2 = this.this$0.f9652a;
                    this.L$0 = pairA;
                    this.label = 2;
                    Object objA2 = chaloConfigFeature2.a("titoValidationConfigProd", this);
                    if (objA2 != coroutineSingletons) {
                        pair = pairA;
                        obj = objA2;
                        str = (String) obj;
                    }
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChaloConfigFeature chaloConfigFeature3 = this.this$0.f9652a;
                    this.L$0 = pairA;
                    this.label = 3;
                    Object objA3 = chaloConfigFeature3.a("titoValidationConfigBeta", this);
                    if (objA3 != coroutineSingletons) {
                        pair = pairA;
                        obj = objA3;
                        str = (String) obj;
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            pair = (Pair) this.L$0;
            ResultKt.b(obj);
            str = (String) obj;
        } else if (i == 2) {
            pair = (Pair) this.L$0;
            ResultKt.b(obj);
            str = (String) obj;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = (Pair) this.L$0;
            ResultKt.b(obj);
            str = (String) obj;
        }
        Pair pair2 = pair;
        TitoValidationConfigData titoValidationConfigData3 = new TitoValidationConfigData((String) pair2.d(), (String) pair2.e(), new TitoValidationConstraint(), FetchTitoValidationConfigUseCase.h, new TITONotificationJobConfig());
        CityAppModel cityAppModel = (CityAppModel) this.this$0.b.getE().getValue();
        if (cityAppModel != null && (str2 = cityAppModel.f8854a) != null && str.length() != 0) {
            try {
                FetchTitoValidationConfigUseCase fetchTitoValidationConfigUseCase = this.this$0;
                KSerializer<TitoValidationCityWiseConfig> kSerializerSerializer = TitoValidationCityWiseConfig.INSTANCE.serializer();
                fetchTitoValidationConfigUseCase.getClass();
                Object obj2 = null;
                try {
                    titoValidationCityWiseConfig = (TitoValidationCityWiseConfig) ChaloJson.b.b(str, kSerializerSerializer);
                } catch (Exception e) {
                    fetchTitoValidationConfigUseCase.c.i(e);
                    e.printStackTrace();
                    titoValidationCityWiseConfig = null;
                }
                if (titoValidationCityWiseConfig != null) {
                    Iterator it = titoValidationCityWiseConfig.f9640a.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!StringsKt.x(((TitoValidationCityWiseConfigData) next).f9642a, str2, true));
                    TitoValidationCityWiseConfigData titoValidationCityWiseConfigData = (TitoValidationCityWiseConfigData) next;
                    if (titoValidationCityWiseConfigData == null || (list = titoValidationCityWiseConfigData.b) == null) {
                        titoValidationConfigData = titoValidationConfigData3;
                    } else {
                        for (Object obj3 : list) {
                            TitoValidationConfigData titoValidationConfigData4 = (TitoValidationConfigData) obj3;
                            if (Intrinsics.d(titoValidationConfigData4.f9644a, pair2.d()) && Intrinsics.d(titoValidationConfigData4.b, pair2.e())) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        titoValidationConfigData = (TitoValidationConfigData) obj2;
                        if (titoValidationConfigData == null) {
                            titoValidationConfigData = titoValidationConfigData3;
                        }
                    }
                } else {
                    titoValidationConfigData = titoValidationConfigData3;
                }
                this.this$0.g.put(pair2, titoValidationConfigData);
                return titoValidationConfigData;
            } catch (Exception e2) {
                this.this$0.c.i(e2);
            }
        }
        return titoValidationConfigData3;
    }
}
