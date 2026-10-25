package defpackage;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19047a;
    public final /* synthetic */ ToolbarUIState b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ pm(ToolbarUIState toolbarUIState, Function0 function0, int i) {
        this.f19047a = i;
        this.b = toolbarUIState;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19047a) {
            case 0:
                UiEventHandler uiEventHandler = this.b.d;
                if (uiEventHandler == null) {
                    Function0 function0 = this.c;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    uiEventHandler.a();
                }
                break;
            case 1:
                UiEventHandler uiEventHandler2 = this.b.d;
                if (uiEventHandler2 != null) {
                    uiEventHandler2.a();
                } else {
                    Function0 function1 = this.c;
                    if (function1 != null) {
                        function1.invoke();
                    }
                }
                break;
            default:
                UiEventHandler uiEventHandler3 = this.b.d;
                if (uiEventHandler3 != null) {
                    uiEventHandler3.a();
                } else {
                    Function0 function2 = this.c;
                    if (function2 != null) {
                        function2.invoke();
                    }
                }
                break;
        }
        return Unit.f17538a;
    }
}
