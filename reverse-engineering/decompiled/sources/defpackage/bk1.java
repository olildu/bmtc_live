package defpackage;

import androidx.compose.material3.TooltipScope;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bk1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11206a;
    public final /* synthetic */ TooltipScope b;

    public /* synthetic */ bk1(TooltipScope tooltipScope, int i) {
        this.f11206a = i;
        this.b = tooltipScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11206a) {
            case 0:
                break;
        }
        return this.b.obtainAnchorBounds((MeasureScope) obj);
    }
}
