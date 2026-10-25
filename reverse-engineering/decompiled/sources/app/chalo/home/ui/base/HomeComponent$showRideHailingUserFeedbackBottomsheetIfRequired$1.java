package app.chalo.home.ui.base;

import app.chalo.constants.Source;
import app.chalo.datastore.LocalDataStore;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.ridefeedback.domain.GetPostRideFeedbackDataUseCase;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigAppModel;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigModel;
import defpackage.fo;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$showRideHailingUserFeedbackBottomsheetIfRequired$1", f = "HomeComponent.kt", l = {1757, 1760, 1772}, m = "invokeSuspend", v = 1)
final class HomeComponent$showRideHailingUserFeedbackBottomsheetIfRequired$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$showRideHailingUserFeedbackBottomsheetIfRequired$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$showRideHailingUserFeedbackBottomsheetIfRequired$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$showRideHailingUserFeedbackBottomsheetIfRequired$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        RideHailingRemoteConfigAppModel rideHailingRemoteConfigAppModel;
        List list;
        HomeScreenInfoHelper homeScreenInfoHelper;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            LocalDataStore localDataStore = this.this$0.q0;
            this.label = 1;
            obj = localDataStore.f("lastAutoRideBookingFeedback", this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                str = (String) this.L$0;
                ResultKt.b(obj);
                rideHailingRemoteConfigAppModel = (RideHailingRemoteConfigAppModel) obj;
                if (rideHailingRemoteConfigAppModel != null) {
                    list = rideHailingRemoteConfigAppModel.c;
                } else {
                    list = null;
                }
                if (list == null) {
                    list = EmptyList.f17557a;
                }
                this.this$0.E0(new fo(3, str, list));
                homeScreenInfoHelper = this.this$0.p;
                this.L$0 = str;
                this.label = 3;
                if (homeScreenInfoHelper.n(75, CommonBottomSheetType.RideHailingUserFeedbackBottomSheet.b, this) != coroutineSingletons) {
                    str2 = str;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$0;
            ResultKt.b(obj);
        }
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.C, "ride feedback home bottomsheet queued", vo1.s("bookingId", str2), Source.HOME_SCREEN, 12);
        return unit;
        String str3 = (String) obj;
        if (str3 == null) {
            return unit;
        }
        GetPostRideFeedbackDataUseCase getPostRideFeedbackDataUseCase = this.this$0.r0;
        RideHailingRemoteConfigModel.INSTANCE.getClass();
        RideHailingRemoteConfigModel rideHailingRemoteConfigModel = RideHailingRemoteConfigModel.e;
        String str4 = rideHailingRemoteConfigModel.f9115a;
        String str5 = rideHailingRemoteConfigModel.b;
        this.L$0 = str3;
        this.label = 2;
        Object objA = getPostRideFeedbackDataUseCase.a(str4, str5, this);
        if (objA != coroutineSingletons) {
            str = str3;
            obj = objA;
            rideHailingRemoteConfigAppModel = (RideHailingRemoteConfigAppModel) obj;
            if (rideHailingRemoteConfigAppModel != null) {
                list = rideHailingRemoteConfigAppModel.c;
            } else {
                list = null;
            }
            if (list == null) {
                list = EmptyList.f17557a;
            }
            this.this$0.E0(new fo(3, str, list));
            homeScreenInfoHelper = this.this$0.p;
            this.L$0 = str;
            this.label = 3;
            if (homeScreenInfoHelper.n(75, CommonBottomSheetType.RideHailingUserFeedbackBottomSheet.b, this) != coroutineSingletons) {
                str2 = str;
                HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.C, "ride feedback home bottomsheet queued", vo1.s("bookingId", str2), Source.HOME_SCREEN, 12);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
