package app.chalo.home.ui.chalobus;

import app.chalo.constants.Source;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerMetaAppModel;
import app.chalo.home.data.model.app.response.BannerType;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.usecase.HandlePremiumPassRenewFlowUseCase;
import defpackage.sg;
import defpackage.we;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleOnRollOverBannerClickedIntent$1", f = "ChaloBusComponent.kt", l = {1790}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handleOnRollOverBannerClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BannerDataResponseAppModel $bannerData;
    final /* synthetic */ BannerMetaAppModel $bannerMetaData;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3241a;

        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[BannerType.PASS_RIDE_EXPIRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerType.PASS_EXPIRED_WITH_NO_REMAINING_RIDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerType.PASS_EXPIRED_WITH_REMAINING_RIDES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerType.PASS_VALIDITY_EXPIRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_REMAINING_RIDES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_REMAINING_RIDES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BannerType.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f3241a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handleOnRollOverBannerClickedIntent$1(BannerDataResponseAppModel bannerDataResponseAppModel, ChaloBusComponent chaloBusComponent, BannerMetaAppModel bannerMetaAppModel, Continuation continuation) {
        super(2, continuation);
        this.$bannerData = bannerDataResponseAppModel;
        this.this$0 = chaloBusComponent;
        this.$bannerMetaData = bannerMetaAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$handleOnRollOverBannerClickedIntent$1(this.$bannerData, this.this$0, this.$bannerMetaData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$handleOnRollOverBannerClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        switch (WhenMappings.f3241a[this.$bannerData.f2951a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                this.this$0.E0(new we(27));
                ChaloBusComponent chaloBusComponent = this.this$0;
                BannerMetaAppModel bannerMetaAppModel = this.$bannerMetaData;
                this.label = 1;
                chaloBusComponent.getClass();
                SuperPassTripPreferences superPassTripPreferences = bannerMetaAppModel.f;
                SuperPassTripPreferences superPassTripPreferences2 = new SuperPassTripPreferences(superPassTripPreferences != null ? superPassTripPreferences.f9575a : null, superPassTripPreferences != null ? superPassTripPreferences.b : null, superPassTripPreferences != null ? superPassTripPreferences.c : null, superPassTripPreferences != null ? superPassTripPreferences.d : null, superPassTripPreferences != null ? superPassTripPreferences.e : null);
                HandlePremiumPassRenewFlowUseCase handlePremiumPassRenewFlowUseCase = chaloBusComponent.F;
                PassTierType passTierType = bannerMetaAppModel.g;
                String str = bannerMetaAppModel.e;
                if (str == null) {
                    str = "";
                }
                Object objC = handlePremiumPassRenewFlowUseCase.c(passTierType, str, superPassTripPreferences2, Source.CHALO_BUS_SCREEN_TAB, new sg(chaloBusComponent, 3), this);
                if (objC != coroutineSingletons) {
                    objC = unit;
                }
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            case 9:
                return unit;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
