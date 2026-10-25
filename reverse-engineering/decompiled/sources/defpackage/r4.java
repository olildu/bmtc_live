package defpackage;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.sqlite.db.SupportSQLiteProgram;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19175a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ r4(int i, String str) {
        this.f19175a = 2;
        this.c = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19175a) {
            case 0:
                SupportSQLiteProgram it = (SupportSQLiteProgram) obj;
                Intrinsics.i(it, "it");
                String str = this.b;
                int i = this.c + 1;
                if (str == null) {
                    it.bindNull(i);
                } else {
                    it.bindString(i, str);
                }
                return Unit.f17538a;
            case 1:
                return ImeEditCommand_androidKt.commitText$lambda$0(this.b, this.c, (TextFieldBuffer) obj);
            default:
                OfflineCardRechargeViewState it2 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it2, "it");
                return OfflineCardRechargeViewState.a(it2, null, null, null, null, Long.valueOf(this.c), this.b, null, null, null, false, false, false, false, null, null, false, false, null, 2095055);
        }
    }

    public /* synthetic */ r4(String str, int i, int i2) {
        this.f19175a = i2;
        this.b = str;
        this.c = i;
    }
}
