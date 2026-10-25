package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19671a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ tm(Function0 function0, Function0 function1, int i) {
        this.f19671a = i;
        this.b = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19671a) {
            case 0:
                Function0 function0 = this.b;
                if (function0 != null) {
                    function0.invoke();
                } else {
                    Function0 function1 = this.c;
                    if (function1 != null) {
                        function1.invoke();
                    }
                }
                break;
            case 1:
                Function0 function2 = this.b;
                if (function2 != null) {
                    function2.invoke();
                } else {
                    Function0 function3 = this.c;
                    if (function3 != null) {
                        function3.invoke();
                    }
                }
                break;
            default:
                Function0 function4 = this.b;
                if (function4 != null) {
                    function4.invoke();
                } else {
                    Function0 function5 = this.c;
                    if (function5 != null) {
                        function5.invoke();
                    }
                }
                break;
        }
        return Unit.f17538a;
    }
}
