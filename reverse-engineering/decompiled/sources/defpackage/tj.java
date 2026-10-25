package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.theme.ChaloTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tj implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19663a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ tj(int i, long j, int i2, long j2) {
        this.b = i;
        this.c = j;
        this.e = i2;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f19663a;
        LazyItemScope items = (LazyItemScope) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(items, "$this$items");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                }
                if (composer.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(72324510, iIntValue2, -1, "app.chalo.compose.components.ChaloDotsIndicatorWithSelectedPosition.<anonymous>.<anonymous>.<anonymous> (ChaloDotsIndicators.kt:57)");
                    }
                    int i2 = this.b;
                    int i3 = this.e;
                    if (iIntValue == i2) {
                        composer.startReplaceGroup(-1454047520);
                        ChaloDotsIndicatorsKt.d(i2, this.c, i3, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1453819980);
                        ChaloDotsIndicatorsKt.c(this.d, composer, 0);
                        composer.endReplaceGroup();
                    }
                    if (iIntValue != i3 - 1) {
                        composer.startReplaceGroup(-1453698150);
                        SpacerKt.Spacer(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer, 6).d, 0.0f, 2, null), composer, 0);
                    } else {
                        composer.startReplaceGroup(-1455859036);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                Intrinsics.i(items, "$this$items");
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= composer2.changed(iIntValue) ? 32 : 16;
                }
                if (composer2.shouldExecute((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(749982920, iIntValue3, -1, "app.chalo.compose.components.ChaloDotsIndicator.<anonymous>.<anonymous>.<anonymous> (ChaloDotsIndicators.kt:31)");
                    }
                    if (iIntValue == this.b) {
                        composer2.startReplaceGroup(321348940);
                        ChaloDotsIndicatorsKt.c(this.c, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(321432330);
                        ChaloDotsIndicatorsKt.c(this.d, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (iIntValue != this.e - 1) {
                        composer2.startReplaceGroup(321554160);
                        SpacerKt.Spacer(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer2, 6).d, 0.0f, 2, null), composer2, 0);
                    } else {
                        composer2.startReplaceGroup(320230522);
                    }
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ tj(int i, long j, long j2, int i2) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }
}
