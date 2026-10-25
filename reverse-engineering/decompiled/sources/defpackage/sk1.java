package defpackage;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sk1 implements BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19311a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk1(Object obj, int i) {
        this.f19311a = i;
        this.b = obj;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        switch (this.f19311a) {
            case 0:
                ((TransformKeyframeAnimation) this.b).k = true;
                break;
            case 1:
                ((TransformKeyframeAnimation) this.b).k = true;
                break;
            case 2:
                ((TransformKeyframeAnimation) this.b).k = true;
                break;
            default:
                BaseLayer baseLayer = (BaseLayer) this.b;
                boolean z = baseLayer.r.m() == 1.0f;
                if (z != baseLayer.x) {
                    baseLayer.x = z;
                    baseLayer.o.invalidateSelf();
                }
                break;
        }
    }
}
