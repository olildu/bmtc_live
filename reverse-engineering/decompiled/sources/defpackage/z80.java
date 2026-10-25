package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import androidx.compose.ui.node.TraversableNode;
import app.chalo.constants.AppConstants;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserException;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.http.Url;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20175a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ z80(int i, Function1 function1, Function1 function2) {
        this.f20175a = i;
        this.b = function1;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Url urlB;
        Function1 function1;
        Function1 function2;
        switch (this.f20175a) {
            case 0:
                Intrinsics.i(obj, "<this>");
                Function1 function3 = this.b;
                if (function3 != null) {
                    function3.invoke(obj);
                }
                this.c.invoke(obj);
                return Unit.f17538a;
            case 1:
                return SnapshotKt.mergedReadObserver$lambda$0(this.b, this.c, obj);
            case 2:
                return SnapshotKt.mergedWriteObserver$lambda$0(this.b, this.c, obj);
            case 3:
                return SnapshotObserverKt.mergeObservers$lambda$1(this.b, this.c, obj);
            case 4:
                return Boolean.valueOf(TextContextMenuModifierKt.traverseTextContextMenuDataNodes$lambda$0(this.b, this.c, (TraversableNode) obj));
            default:
                String str = (String) obj;
                boolean z = false;
                if (str != null) {
                    try {
                        URLBuilder uRLBuilder = new URLBuilder();
                        URLParserKt.b(uRLBuilder, str);
                        if (uRLBuilder.f16808a.length() <= 0) {
                            uRLBuilder = null;
                        }
                        urlB = uRLBuilder != null ? uRLBuilder.b() : null;
                        break;
                    } catch (URLParserException unused) {
                    }
                    if (urlB != null) {
                        URLProtocol protocolOrNull = urlB.getProtocolOrNull();
                        String name = protocolOrNull != null ? protocolOrNull.getName() : null;
                        if (name != null) {
                            boolean z2 = name.length() > 0;
                            boolean z3 = urlB.getHost().length() > 0;
                            if (z2 && z3) {
                                URLProtocol protocolOrNull2 = urlB.getProtocolOrNull();
                                String name2 = protocolOrNull2 != null ? protocolOrNull2.getName() : null;
                                if (name2 == null || !name2.equalsIgnoreCase("chalo") || (function2 = this.b) == null) {
                                    String host = urlB.getHost();
                                    if ((host == null ? false : AppConstants.b.h(host)) && (function1 = this.c) != null) {
                                        function1.invoke(str);
                                    }
                                } else {
                                    function2.invoke(str);
                                }
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
