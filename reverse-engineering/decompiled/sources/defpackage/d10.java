package defpackage;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPairRule;
import androidx.window.embedding.SplitPinRule;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.embedding.SplitRule;
import androidx.window.reflection.Predicate2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d10 implements Predicate2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15418a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ SplitRule c;

    public /* synthetic */ d10(SplitRule splitRule, Context context, int i) {
        this.f15418a = i;
        this.c = splitRule;
        this.b = context;
    }

    @Override // androidx.window.reflection.Predicate2
    public final boolean test(Object obj) {
        switch (this.f15418a) {
            case 0:
                return EmbeddingAdapter.translateSplitPinRule$lambda$8((SplitPinRule) this.c, this.b, (WindowMetrics) obj);
            case 1:
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$14((SplitPlaceholderRule) this.c, this.b, (WindowMetrics) obj);
            default:
                return EmbeddingAdapter.translateSplitPairRule$lambda$7((SplitPairRule) this.c, this.b, (WindowMetrics) obj);
        }
    }
}
