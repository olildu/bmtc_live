package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.MaterialCheckable;
import so.plotline.insights.OptionModals.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class no implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18530a;
    public final /* synthetic */ View b;

    public /* synthetic */ no(View view, int i) {
        this.f18530a = i;
        this.b = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f18530a;
        View view = this.b;
        switch (i) {
            case 0:
                Chip chip = (Chip) view;
                MaterialCheckable.OnCheckedChangeListener onCheckedChangeListener = chip.f;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.a(chip, z);
                    throw null;
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.e;
                if (onCheckedChangeListener2 != null) {
                    onCheckedChangeListener2.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            default:
                int i2 = a.g;
                ((a) view).setIsSelected(Boolean.valueOf(z));
                return;
        }
    }
}
