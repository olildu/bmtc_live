package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19792a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ v1(MutableState mutableState, Function0 function0, int i) {
        this.f19792a = i;
        this.c = mutableState;
        this.b = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19792a) {
            case 0:
                MutableState mutableState = this.c;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                this.b.invoke();
                break;
            case 1:
                MutableState mutableState2 = this.c;
                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                this.b.invoke();
                break;
            case 2:
                MutableState mutableState3 = this.c;
                if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                    this.b.invoke();
                }
                mutableState3.setValue(Boolean.TRUE);
                break;
            case 3:
                MutableState mutableState4 = this.c;
                mutableState4.setValue(Boolean.valueOf(!((Boolean) mutableState4.getValue()).booleanValue()));
                this.b.invoke();
                break;
            default:
                MutableState mutableState5 = this.c;
                mutableState5.setValue(Boolean.valueOf(!((Boolean) mutableState5.getValue()).booleanValue()));
                this.b.invoke();
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ v1(Function0 function0, MutableState mutableState, int i) {
        this.f19792a = i;
        this.b = function0;
        this.c = mutableState;
    }
}
