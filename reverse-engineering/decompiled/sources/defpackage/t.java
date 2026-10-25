package defpackage;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.ImageView;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.Lifecycle;
import androidx.viewbinding.ViewBinding;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.chalo.login.truecaller.AndroidTruecallerSetupHandlerImpl;
import app.chalo.network.config.KPlatformSocketConfig;
import app.chalo.network.di.a;
import app.chalo.network.mock.MockApiFixtureLoader;
import com.adster.sdk.mediation.AdapterStatus;
import com.truecaller.android.sdk.TruecallerSDK;
import io.ktor.client.engine.HttpClientEngine;
import kotlin.Lazy;
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
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19614a;

    public /* synthetic */ t(int i) {
        this.f19614a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19614a;
        int i2 = 8;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$6$lambda$5((Lifecycle.Event) obj);
            case 1:
                return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$2((SemanticsPropertyReceiver) obj);
            case 2:
                return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$5((SemanticsPropertyReceiver) obj);
            case 3:
                Intrinsics.i((LayoutCoordinates) obj, "it");
                return unit;
            case 4:
                AdapterStatus it = (AdapterStatus) obj;
                Intrinsics.i(it, "it");
                return it.getAdapterName() + "=" + it.getStatus();
            case 5:
                ImageView choiceView = (ImageView) obj;
                Intrinsics.i(choiceView, "choiceView");
                choiceView.setVisibility(8);
                choiceView.setOnClickListener(null);
                return unit;
            case 6:
                return Float.valueOf(AnchoredDraggableDefaults.PositionalThreshold$lambda$0(((Float) obj).floatValue()));
            case 7:
                return Boolean.valueOf(AnchoredDraggableKt.AnchoredDraggableState$lambda$2(obj));
            case 8:
                return Boolean.valueOf(AnchoredDraggableKt.AnchoredDraggableState$lambda$0(obj));
            case 9:
                return Boolean.valueOf(AnchoredDraggableKt.AlwaysDrag$lambda$0((PointerType) obj));
            case 10:
                return Float.valueOf(AnchoredDraggableKt.GetOrNan$lambda$0(((Integer) obj).intValue()));
            case 11:
                return Boolean.valueOf(AnchoredDraggableState._init_$lambda$0(obj));
            case 12:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.confirmValueChange$lambda$0(obj));
            case 13:
                return Boolean.valueOf(AnchoredDraggableState._init_$lambda$1(obj));
            case 14:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState._init_$lambda$0(obj));
            case 15:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$2(obj));
            case 16:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$5(obj));
            case 17:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$1(obj);
            case 18:
                vo1.x("initialised adapters=", (String) obj, "message");
                return unit;
            case 19:
                return AndroidExternalSurface_androidKt.AndroidExternalSurface_58FFMhA$lambda$1$0((SurfaceView) obj);
            case 20:
                return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0((Context) obj);
            case 21:
                return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0((TextureView) obj);
            case 22:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                StringQualifier stringQualifier = new StringQualifier("network_config.preferences_pb");
                a aVar = new a();
                Kind kind = Kind.Singleton;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(DataStore.class);
                StringQualifier stringQualifier2 = ScopeRegistry.e;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, classReferenceA, stringQualifier, aVar, kind, emptyList), module));
                StringQualifier stringQualifierN = i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(Boolean.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(MockApiFixtureLoader.class), null, new m3(4), kind, emptyList), module), "API_SOURCE_DEBUG_BUILD_GATE_KEY"), new m3(5), kind, emptyList), module), "lowPriority");
                m3 m3Var = new m3(6);
                Kind kind2 = Kind.Factory;
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(HttpClientEngine.class), stringQualifierN, m3Var, kind2, emptyList), module));
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(HttpClientEngine.class), new StringQualifier("mediumPriority"), new m3(7), kind2, emptyList), module));
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(HttpClientEngine.class), new StringQualifier("highPriority"), new m3(i2), kind2, emptyList), module));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(KPlatformSocketConfig.class), null, new m3(9), kind, emptyList), module));
                return unit;
            case 23:
                AndroidStatement execute = (AndroidStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                return Long.valueOf(execute.execute());
            case 24:
                TruecallerSDK performWithSafeInstance = (TruecallerSDK) obj;
                Lazy lazy = AndroidTruecallerSetupHandlerImpl.d;
                Intrinsics.i(performWithSafeInstance, "$this$performWithSafeInstance");
                return Boolean.valueOf(performWithSafeInstance.isUsable());
            case 25:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$2$0((ViewBinding) obj);
            case 26:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$3$0((ViewBinding) obj);
            case 27:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$0$0((ViewBinding) obj);
            case 28:
                return AnimationKt.createAnimation$lambda$0((AnimationVector) obj);
            default:
                return AnimationKt.createAnimation$lambda$1((AnimationVector) obj);
        }
    }
}
