package book_3.chapter_5;

interface ThrowableBall
{
    void throwBall();
    void catchBall();
}
interface KickableBall
{
    void kickBall();
    void catchBall();
}
public interface PlayableBall
        extends ThrowableBall, KickableBall
{
    void dropBall();
}