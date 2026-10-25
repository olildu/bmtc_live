package app.chalo.uistate.dialog;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/uistate/dialog/DialogUIEventHandler;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DialogUIEventHandler {
    public static final DialogUIEventHandler d = new DialogUIEventHandler(false, false, DialogDismissRequest.Companion.f9986a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9988a;
    public final boolean b;
    public final DialogDismissRequest c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DialogUIEventHandler$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DialogUIEventHandler(boolean z, boolean z2, DialogDismissRequest dialogDismissRequest) {
        this.f9988a = z;
        this.b = z2;
        this.c = dialogDismissRequest;
    }

    public static DialogUIEventHandler a(DialogUIEventHandler dialogUIEventHandler, DialogDismissRequest$Companion$fromLambda$1 dialogDismissRequest$Companion$fromLambda$1) {
        boolean z = dialogUIEventHandler.f9988a;
        boolean z2 = dialogUIEventHandler.b;
        dialogUIEventHandler.getClass();
        return new DialogUIEventHandler(z, z2, dialogDismissRequest$Companion$fromLambda$1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogUIEventHandler)) {
            return false;
        }
        DialogUIEventHandler dialogUIEventHandler = (DialogUIEventHandler) obj;
        return this.f9988a == dialogUIEventHandler.f9988a && this.b == dialogUIEventHandler.b && Intrinsics.d(this.c, dialogUIEventHandler.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.f9988a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("DialogUIEventHandler(dismissOnBackPress=", ", dismissOnClickOutside=", ", onDismissRequest=", this.f9988a, this.b);
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
