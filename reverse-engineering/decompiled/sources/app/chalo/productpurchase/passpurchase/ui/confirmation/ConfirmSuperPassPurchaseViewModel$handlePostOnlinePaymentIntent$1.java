package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.constants.Source;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.network.config.ChaloJson;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModelKt;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductFareInfoResponseAppModel;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.utils.FareUtils;
import defpackage.vo1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmSuperPassPurchaseIntent.PostOnlinePaymentIntent $intent;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8384a;

        static {
            int[] iArr = new int[BannerStatus.values().length];
            try {
                iArr[BannerStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerStatus.IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8384a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, ConfirmSuperPassPurchaseIntent.PostOnlinePaymentIntent postOnlinePaymentIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
        this.$intent = postOnlinePaymentIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ConfirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1 confirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1 = (ConfirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        confirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        String strA;
        String strA2;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        MutableStateFlow mutableStateFlow = this.this$0.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a((ConfirmSuperPassPurchaseDataState) value, false, false, null, null, null, null, null, null, null, null, 2043)));
        BookableSuperPassConfiguration bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) this.this$0.l.getF().getValue()).i;
        Unit unit = Unit.f17538a;
        if (bookableSuperPassConfiguration == null) {
            return unit;
        }
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c;
        SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel = superPassProductConfigFareMappingResponseAppModel.o;
        SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel2 = superPassProductConfigFareMappingResponseAppModel.o;
        if (superPassProductFareInfoResponseAppModel.c) {
            strA = this.this$0.D.d().equals("₹") ? vo1.A(this.this$0.D.d(), FareUtils.a(AllProductConfigsResponseAppModelKt.b(superPassProductFareInfoResponseAppModel2))) : vo1.A(this.this$0.D.d(), AllProductConfigsResponseAppModelKt.b(superPassProductFareInfoResponseAppModel2));
        } else {
            strA = null;
        }
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
        ChaloNavigationManager chaloNavigationManager = confirmSuperPassPurchaseViewModel.q;
        Source source = Source.SOURCE_CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT;
        String str = this.$intent.c.b;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties = bookableSuperPassConfiguration.b;
        String str2 = superPassProductConfigurationProperties.i;
        String str3 = superPassProductConfigurationProperties.j;
        List list = ((ConfirmSuperPassPurchaseDataState) confirmSuperPassPurchaseViewModel.f.getValue()).k;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int i = WhenMappings.f8384a[((BannerDataResponseAppModel) next).c.d.ordinal()];
                if (i == 1 || i == 2) {
                    break;
                }
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            BannerDataResponseAppModel bannerDataResponseAppModel = (BannerDataResponseAppModel) next;
            if (bannerDataResponseAppModel != null) {
                Json json = ChaloJson.b;
                BannerUiDataAppModel bannerUiDataAppModel = bannerDataResponseAppModel.c;
                json.getClass();
                strA2 = json.a(BannerUiDataAppModel.INSTANCE.serializer(), bannerUiDataAppModel);
            } else {
                strA2 = null;
            }
        } else {
            strA2 = null;
        }
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductActivationArgs(str, str2, str3, source, strA2, strA, null, 624), new ChaloNavOptions(new PopUpToConfig.Finish(this.this$0.k), 3), null, 4));
        return unit;
    }
}
