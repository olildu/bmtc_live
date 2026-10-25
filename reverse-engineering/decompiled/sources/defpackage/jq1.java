package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import so.plotline.insights.Helpers.b;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class jq1 implements a.o, b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f17430a;

    @Override // so.plotline.insights.Helpers.b.c
    public void a(Typeface typeface) {
        if (typeface != null) {
            TextView textView = this.f17430a;
            textView.setTypeface(typeface);
            textView.setVisibility(0);
        }
    }
}
