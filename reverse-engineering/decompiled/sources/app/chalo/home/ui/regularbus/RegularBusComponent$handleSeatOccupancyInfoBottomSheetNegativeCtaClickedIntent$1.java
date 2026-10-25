package app.chalo.home.ui.regularbus;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import defpackage.g11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$handleSeatOccupancyInfoBottomSheetNegativeCtaClickedIntent$1", f = "RegularBusComponent.kt", l = {2055, 2056, 2063}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$handleSeatOccupancyInfoBottomSheetNegativeCtaClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$handleSeatOccupancyInfoBottomSheetNegativeCtaClickedIntent$1(RegularBusComponent regularBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$handleSeatOccupancyInfoBottomSheetNegativeCtaClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$handleSeatOccupancyInfoBottomSheetNegativeCtaClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objB;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            String strB = CityProviderKt.b(this.this$0.t);
            if (strB != null) {
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                LiveTrackingConfigDataStore liveTrackingConfigDataStore = this.this$0.L;
                this.label = 1;
                obj = liveTrackingConfigDataStore.j(lowerCase, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                String str3 = (String) this.L$0;
                ResultKt.b(obj);
                str = str3;
                HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.F, "seat occupancy bottomsheet learn more clicked", null, Source.REGULAR_BUS_SCREEN_TAB, 14);
                this.L$0 = str;
                this.label = 3;
                objB = this.this$0.o.b(StringEnum.FEATURE_UPDATE, new Object[0], this);
                if (objB != coroutineSingletons) {
                    str2 = str;
                    obj = objB;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$0;
            ResultKt.b(obj);
        }
        this.this$0.M.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str2, (String) obj, false, false), null, null, 6));
        this.this$0.E0(new g11(6));
        this.this$0.s.d(true);
        return unit;
        str = (String) obj;
        LiveTrackingConfigDataStore liveTrackingConfigDataStore2 = this.this$0.L;
        this.L$0 = str;
        this.label = 2;
        if (liveTrackingConfigDataStore2.f(this) != coroutineSingletons) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.F, "seat occupancy bottomsheet learn more clicked", null, Source.REGULAR_BUS_SCREEN_TAB, 14);
            this.L$0 = str;
            this.label = 3;
            objB = this.this$0.o.b(StringEnum.FEATURE_UPDATE, new Object[0], this);
            if (objB != coroutineSingletons) {
                str2 = str;
                obj = objB;
                this.this$0.M.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str2, (String) obj, false, false), null, null, 6));
                this.this$0.E0(new g11(6));
                this.this$0.s.d(true);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
