package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11245a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ c2(MutableState mutableState, MutableState mutableState2, int i) {
        this.f11245a = i;
        this.b = mutableState;
        this.c = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11245a) {
            case 0:
                this.b.setValue(null);
                this.c.setValue(null);
                break;
            case 1:
                this.b.setValue(null);
                this.c.setValue(null);
                break;
            case 2:
                this.b.setValue(null);
                this.c.setValue(null);
                break;
            case 3:
                this.b.setValue(null);
                this.c.setValue(null);
                break;
            case 4:
                this.b.setValue(null);
                this.c.setValue(null);
                break;
            case 5:
                this.b.setValue(null);
                this.c.setValue(null);
                break;
            case 6:
                this.b.setValue(null);
                this.c.setValue(null);
                break;
            default:
                MutableState mutableState = this.b;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                MutableState mutableState2 = this.c;
                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                break;
        }
        return Unit.f17538a;
    }
}
