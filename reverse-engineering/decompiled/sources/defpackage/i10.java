package defpackage;

import android.content.Context;
import androidx.window.embedding.EmbeddingBackend;
import androidx.window.embedding.EmbeddingBackendDecorator;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i10 {
    static {
        EmbeddingBackend.Companion companion = EmbeddingBackend.INSTANCE;
    }

    public static EmbeddingBackend a(Context context) {
        return EmbeddingBackend.INSTANCE.getInstance(context);
    }

    public static void b(EmbeddingBackendDecorator embeddingBackendDecorator) {
        EmbeddingBackend.INSTANCE.overrideDecorator(embeddingBackendDecorator);
    }

    public static void c() {
        EmbeddingBackend.INSTANCE.reset();
    }
}
