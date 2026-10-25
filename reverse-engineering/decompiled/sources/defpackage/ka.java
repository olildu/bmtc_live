package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17479a = 0;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ BasicTooltipState c;

    public /* synthetic */ ka(BasicTooltipState basicTooltipState, CoroutineScope coroutineScope) {
        this.c = basicTooltipState;
        this.b = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17479a) {
            case 0:
                return BasicTooltipKt.TooltipPopup$lambda$0$0(this.c, this.b);
            default:
                return Boolean.valueOf(BasicTooltipKt.anchorSemantics$lambda$0$0(this.b, this.c));
        }
    }

    public /* synthetic */ ka(CoroutineScope coroutineScope, BasicTooltipState basicTooltipState) {
        this.b = coroutineScope;
        this.c = basicTooltipState;
    }
}
