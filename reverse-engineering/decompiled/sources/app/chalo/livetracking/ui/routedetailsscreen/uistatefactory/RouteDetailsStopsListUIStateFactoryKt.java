package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
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
import defpackage.t11;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsStopsListUIStateFactoryKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(StringProvider stringProvider, t11 t11Var, ContinuationImpl continuationImpl) {
        RouteDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1 routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1;
        ImageUIState imageUIState;
        Function0 function0;
        if (continuationImpl instanceof RouteDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1) {
            routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1 = (RouteDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1) continuationImpl;
            int i = routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1 = new RouteDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1(continuationImpl);
            }
        } else {
            routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1 = new RouteDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1(continuationImpl);
        }
        Object objB = routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState2 = new ImageUIState(IconType.ROUTE_REPORT_PROBLEM, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().c)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.L$0 = t11Var;
            routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.L$1 = imageUIState2;
            routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.TV_REPORT_PROBLEM_HOOK, new Object[0], routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1);
            if (objB == obj) {
                return obj;
            }
            imageUIState = imageUIState2;
            function0 = t11Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageUIState = (ImageUIState) routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.L$1;
            function0 = (Function0) routeDetailsStopsListUIStateFactoryKt$routeReportProblemCTAUIState$1.L$0;
            ResultKt.b(objB);
        }
        return new RouteReportProblemCTAUIState(UiEventHandler.Companion.a(function0), imageUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124));
    }
}
