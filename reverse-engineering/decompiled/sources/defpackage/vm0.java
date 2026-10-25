package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.network.logging.NetworkCallInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vm0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19851a;
    public final /* synthetic */ NetworkCallInfo b;

    public /* synthetic */ vm0(NetworkCallInfo networkCallInfo, int i) {
        this.f19851a = i;
        this.b = networkCallInfo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strValueOf;
        switch (this.f19851a) {
            case 0:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(280915053, iIntValue, -1, "app.chalo.core.compose.NetworkInspectorDetails.<anonymous>.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:222)");
                    }
                    NetworkInspectorScreenKt.b("Request overview", null, ComposableLambdaKt.rememberComposableLambda(583582980, true, new vm0(this.b, 3), composer, 54), composer, 390);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1713402012, iIntValue2, -1, "app.chalo.core.compose.NetworkInspectorDetails.<anonymous>.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:233)");
                    }
                    NetworkInspectorScreenKt.b("Request", null, ComposableLambdaKt.rememberComposableLambda(1387667003, true, new vm0(this.b, 5), composer2, 54), composer2, 390);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(item3, "$this$item");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1703631451, iIntValue3, -1, "app.chalo.core.compose.NetworkInspectorDetails.<anonymous>.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:240)");
                    }
                    NetworkInspectorScreenKt.b("Response", null, ComposableLambdaKt.rememberComposableLambda(1397437564, true, new vm0(this.b, 4), composer3, 54), composer3, 390);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                ColumnScope DetailSection = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(DetailSection, "$this$DetailSection");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(583582980, iIntValue4, -1, "app.chalo.core.compose.NetworkInspectorDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:223)");
                    }
                    NetworkCallInfo networkCallInfo = this.b;
                    NetworkInspectorScreenKt.a("URL", networkCallInfo.b, composer4, 6);
                    DividerKt.m1950HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer4, 0, 7);
                    NetworkInspectorScreenKt.a("Requested At", String.valueOf(networkCallInfo.c), composer4, 6);
                    DividerKt.m1950HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer4, 0, 7);
                    NetworkInspectorScreenKt.a("Request Type", networkCallInfo.e.f16800a, composer4, 6);
                    DividerKt.m1950HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer4, 0, 7);
                    Integer num = networkCallInfo.g;
                    if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                        strValueOf = "In progress";
                    }
                    NetworkInspectorScreenKt.a("Response Code", strValueOf, composer4, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 4:
                ColumnScope DetailSection2 = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(DetailSection2, "$this$DetailSection");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1397437564, iIntValue5, -1, "app.chalo.core.compose.NetworkInspectorDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:241)");
                    }
                    NetworkCallInfo networkCallInfo2 = this.b;
                    NetworkInspectorScreenKt.a("Response Headers", NetworkInspectorScreenKt.f(networkCallInfo2.h), composer5, 6);
                    DividerKt.m1950HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer5, 0, 7);
                    String str = networkCallInfo2.i;
                    if (str == null) {
                        str = "No response body";
                    }
                    NetworkInspectorScreenKt.a("Response Body", str, composer5, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            default:
                ColumnScope DetailSection3 = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(DetailSection3, "$this$DetailSection");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1387667003, iIntValue6, -1, "app.chalo.core.compose.NetworkInspectorDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:234)");
                    }
                    NetworkCallInfo networkCallInfo3 = this.b;
                    NetworkInspectorScreenKt.a("Request Headers", NetworkInspectorScreenKt.f(networkCallInfo3.d), composer6, 6);
                    DividerKt.m1950HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer6, 0, 7);
                    String str2 = networkCallInfo3.f;
                    if (str2 == null) {
                        str2 = "No request body";
                    }
                    NetworkInspectorScreenKt.a("Request Body", str2, composer6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
