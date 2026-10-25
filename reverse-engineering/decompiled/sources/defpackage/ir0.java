package defpackage;

import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutViewState;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationDataState;
import app.chalo.productbooking.pickroutelocation.PickRouteSnackBarErrorType;
import app.chalo.productbooking.pickstop.PickStopDataState;
import com.google.android.gms.maps.model.Polyline;
import com.mmk.kmpnotifier.di.Platform;
import com.mmk.kmpnotifier.di.PlatformModule_androidKt;
import com.mmk.kmpnotifier.di.PlatformModule_androidKt$platformModule$lambda$4$$inlined$factoryOf$default$1;
import com.mmk.kmpnotifier.di.PlatformModule_androidKt$platformModule$lambda$4$$inlined$factoryOf$default$2;
import com.mmk.kmpnotifier.firebase.FirebasePushNotifierImpl;
import com.mmk.kmpnotifier.notification.AndroidNotifier;
import com.mmk.kmpnotifier.notification.Notifier;
import com.mmk.kmpnotifier.notification.PushNotifier;
import com.mmk.kmpnotifier.permission.AndroidMockPermissionUtil;
import com.mmk.kmpnotifier.permission.PermissionUtil;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ir0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17085a;

    public /* synthetic */ ir0(int i) {
        this.f17085a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17085a;
        int i2 = 1;
        int i3 = 0;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                PbPassPurchaseLandingScreenDataState it = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it, "it");
                return PbPassPurchaseLandingScreenDataState.a(it, null, false, false, false, null, null, null, null, false, false, 4087);
            case 1:
                PbPassPurchaseLandingScreenDataState it2 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return PbPassPurchaseLandingScreenDataState.a(it2, null, false, false, true, null, null, null, null, false, false, 4055);
            case 2:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, PBStopSelectionScreenBottomSheetType.NoOriginDestinationPairsAvailable.f7959a, null, null, null, false, false, 4055);
            case 3:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, null, null, null, null, false, false, 4055);
            case 4:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, null, null, null, null, false, false, 4055);
            case 5:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, null, null, null, null, false, false, 4087);
            case 6:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, PBStopSelectionScreenBottomSheetType.NoProductFoundBottomSheet.f7960a, null, null, null, false, false, 4055);
            case 7:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, null, null, null, null, false, false, 4087);
            case 8:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("pending_super_pass_table");
                return unit;
            case 9:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("pending_super_pass_table");
                return unit;
            case 10:
                Intrinsics.i((PhonePeCheckoutViewState) obj, "it");
                return new PhonePeCheckoutViewState(false);
            case 11:
                ((PhonePeCheckoutViewState) obj).getClass();
                return new PhonePeCheckoutViewState(false);
            case 12:
                ((PhonePeCheckoutViewState) obj).getClass();
                return new PhonePeCheckoutViewState(true);
            case 13:
                PickRouteLocationDataState it3 = (PickRouteLocationDataState) obj;
                Intrinsics.i(it3, "it");
                return PickRouteLocationDataState.a(it3, false, false, null, null, SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN, "", null, null, false, false, null, 1997);
            case 14:
                PickRouteLocationDataState it4 = (PickRouteLocationDataState) obj;
                Intrinsics.i(it4, "it");
                return PickRouteLocationDataState.a(it4, false, false, null, null, SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN, "", null, null, false, false, null, 1997);
            case 15:
                PickRouteLocationDataState it5 = (PickRouteLocationDataState) obj;
                Intrinsics.i(it5, "it");
                return PickRouteLocationDataState.a(it5, false, false, null, null, null, null, null, null, false, false, null, 1983);
            case 16:
                PickRouteLocationDataState it6 = (PickRouteLocationDataState) obj;
                Intrinsics.i(it6, "it");
                return PickRouteLocationDataState.a(it6, true, false, null, null, null, null, null, null, false, false, null, 1982);
            case 17:
                PickRouteLocationDataState it7 = (PickRouteLocationDataState) obj;
                Intrinsics.i(it7, "it");
                return PickRouteLocationDataState.a(it7, false, false, null, null, null, null, null, null, false, false, null, FrameMetricsAggregator.EVERY_DURATION);
            case 18:
                return PickRouteLocationDataState.a((PickRouteLocationDataState) obj, false, false, null, null, null, null, PickRouteSnackBarErrorType.ROUTES_API_FAILED, null, false, false, null, 1982);
            case 19:
                return PickRouteLocationDataState.a((PickRouteLocationDataState) obj, false, false, null, null, null, null, null, null, false, false, null, 2046);
            case 20:
                return PickRouteLocationDataState.a((PickRouteLocationDataState) obj, false, false, EmptyList.f17557a, null, SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN, null, PickRouteSnackBarErrorType.NO_INTERNET_ERROR, null, false, false, null, 1961);
            case 21:
                PickStopDataState it8 = (PickStopDataState) obj;
                Intrinsics.i(it8, "it");
                return PickStopDataState.a(it8, null, true, null, null, 29);
            case 22:
                return PickStopDataState.a((PickStopDataState) obj, null, false, EmptyList.f17557a, null, 25);
            case 23:
                Module module = (Module) obj;
                Context context = PlatformModule_androidKt.f15310a;
                Intrinsics.i(module, "$this$module");
                qe0 qe0Var = new qe0(29);
                Kind kind = Kind.Factory;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(Platform.Android.class);
                StringQualifier stringQualifier = ScopeRegistry.e;
                DefinitionBindingKt.a(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, qe0Var, kind, emptyList), module)), Reflection.a(Platform.class));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(Context.class), null, new fs0(i3), Kind.Singleton, emptyList), module));
                KoinDefinition koinDefinition = new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(AndroidMockPermissionUtil.class), null, new PlatformModule_androidKt$platformModule$lambda$4$$inlined$factoryOf$default$1(), kind, emptyList), module));
                OptionDSLKt.c(koinDefinition, null);
                DefinitionBindingKt.a(koinDefinition, Reflection.a(PermissionUtil.class));
                DefinitionBindingKt.a(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(AndroidNotifier.class), null, new fs0(i2), kind, emptyList), module)), Reflection.a(Notifier.class));
                KoinDefinition koinDefinition2 = new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FirebasePushNotifierImpl.class), null, new PlatformModule_androidKt$platformModule$lambda$4$$inlined$factoryOf$default$2(), kind, emptyList), module));
                OptionDSLKt.c(koinDefinition2, null);
                DefinitionBindingKt.a(koinDefinition2, Reflection.a(PushNotifier.class));
                return unit;
            case 24:
                PlotlineWidget view = (PlotlineWidget) obj;
                Intrinsics.i(view, "view");
                return unit;
            case 25:
                Intrinsics.i((Polyline) obj, "it");
                return unit;
            case 26:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("post_ride_feedback_table");
                return unit;
            case 27:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("post_ride_feedback_table");
                return unit;
            case 28:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("post_ride_feedback_table");
                return unit;
            default:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("post_ride_feedback_table");
                return unit;
        }
    }
}
