package defpackage;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsConnection_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.validationsdk.multiproductvalidation.ui.ExpiredQrTicketUIState;
import io.ktor.client.plugins.HttpRetryShouldRetryContext;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f90 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15620a;

    public /* synthetic */ f90(int i) {
        this.f15620a = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15620a) {
            case 0:
                HttpRetryShouldRetryContext retryIf = (HttpRetryShouldRetryContext) obj;
                HttpResponse response = (HttpResponse) obj3;
                Intrinsics.i(retryIf, "$this$retryIf");
                Intrinsics.i((HttpRequest) obj2, "<unused var>");
                Intrinsics.i(response, "response");
                int i = response.getC().f16803a;
                return Boolean.valueOf(500 <= i && i < 600);
            case 1:
                String title = (String) obj;
                String str = (String) obj2;
                IconType warning = (IconType) obj3;
                Intrinsics.i(title, "title");
                Intrinsics.i(warning, "warning");
                return new ExpiredQrTicketUIState(new ImageUIState(IconType.IC_STATIC_QR, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().o), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), new TextUIState.ChaloTextUIState(title, UITextStyle.HeadlineMedium, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), str != null ? new TextUIState.ChaloTextUIState(str, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null, new ImageUIState(warning, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
            case 2:
                return Operation.TestOperation._init_$lambda$0((Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
            case 3:
                Transition.Segment animateDp = (Transition.Segment) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(animateDp, "$this$animateDp");
                composer.startReplaceGroup(492665454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(492665454, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.ChaloTabIndicator.<anonymous> (PremiumBusScrollableTabRow.kt:96)");
                }
                SpringSpec springSpecSpring$default = ((Number) animateDp.getInitialState()).intValue() < ((Number) animateDp.getTargetState()).intValue() ? AnimationSpecKt.spring$default(1.0f, 800.0f, null, 4, null) : AnimationSpecKt.spring$default(1.0f, 1000.0f, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return springSpecSpring$default;
            case 4:
                Transition.Segment animateDp2 = (Transition.Segment) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(animateDp2, "$this$animateDp");
                composer2.startReplaceGroup(604247591);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(604247591, iIntValue2, -1, "app.chalo.premiumbus.ui.slotselection.compose.ChaloTabIndicator.<anonymous> (PremiumBusScrollableTabRow.kt:109)");
                }
                SpringSpec springSpecSpring$default2 = ((Number) animateDp2.getInitialState()).intValue() < ((Number) animateDp2.getTargetState()).intValue() ? AnimationSpecKt.spring$default(1.0f, 1000.0f, null, 4, null) : AnimationSpecKt.spring$default(1.0f, 800.0f, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default2;
            case 5:
                return SliderDefaults.TrackImpl_xlyIBlM$lambda$44$lambda$43((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 6:
                return WindowInsetsConnection_androidKt.imeNestedScroll$lambda$1((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return Integer.valueOf(WindowInsetsSizeKt.startCalc$lambda$0((WindowInsets) obj, (LayoutDirection) obj2, (Density) obj3));
            default:
                return Integer.valueOf(WindowInsetsSizeKt.endCalc$lambda$0((WindowInsets) obj, (LayoutDirection) obj2, (Density) obj3));
        }
    }
}
