package defpackage;

import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class sb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19287a;
    public final /* synthetic */ ByteReadChannel b;

    public /* synthetic */ sb(ByteReadChannel byteReadChannel, int i) {
        this.f19287a = i;
        this.b = byteReadChannel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19287a;
        ByteReadChannel byteReadChannel = this.b;
        HttpResponse replaceResponse = (HttpResponse) obj;
        switch (i) {
            case 0:
                AttributeKey attributeKey = BodyProgressKt.f16638a;
                Intrinsics.i(replaceResponse, "$this$replaceResponse");
                break;
        }
        return byteReadChannel;
    }
}
